package com.lyh.sharding.table.config;

import com.google.common.collect.Range;
import com.lyh.common.exceptions.BaseRuntimeException;
import com.lyh.common.util.DateUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

/**
 * @author luo yihang
 * @date 2019/11/5 16:58
 */
public class PersonRangeShardingAlgorithm implements ComplexKeysShardingAlgorithm<String> {

    private static final String SHARDING_KEY = "username";
    private static final String SHARDING_RANGE_KEY = "createtime";

    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<String> complexKeysShardingValue) {
        List<String> keyList = (List<String>) complexKeysShardingValue.getColumnNameAndShardingValuesMap().get(SHARDING_KEY);
        if (CollectionUtils.isEmpty(keyList)) {
            throw new BaseRuntimeException("请选择分区键");
        }
        // createTime 分区键
        Range keyRange = complexKeysShardingValue.getColumnNameAndRangeValuesMap().get(SHARDING_RANGE_KEY);

        List<String> result = new LinkedList<>();
        List<String> tableNamePreList = new LinkedList<>();
        keyList.forEach(p -> tableNamePreList.add(complexKeysShardingValue.getLogicTableName() + "_" + p.hashCode() % 2));
        // 如果分片键 createTime 为空，则取当前时间
        if (null == keyRange || keyRange.isEmpty()) {
            String dateStr = DateUtil.formatDate(new Date(), DateUtil.YYYY_MM);
            tableNamePreList.forEach(p -> result.add(p + "_" + dateStr));
            return result;
        }
        Date startTime = (Date) keyRange.lowerEndpoint();
        Date endTime = (Date) keyRange.upperEndpoint();

        Calendar startCalender = DateUtil.initCalendarMonth(startTime);
        Calendar endCalender = DateUtil.initCalendarMonth(endTime);
        do {
            String dateStr = DateUtil.formatDate(startCalender.getTime(), DateUtil.YYYY_MM);
            tableNamePreList.forEach(p -> result.add(p + "_" + dateStr));
            startCalender.add(Calendar.MONTH, 1);
        } while (!startCalender.after(endCalender));
        return result;
    }
}
