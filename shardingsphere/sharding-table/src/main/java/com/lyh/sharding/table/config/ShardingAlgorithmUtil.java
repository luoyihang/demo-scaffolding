package com.lyh.sharding.table.config;

import com.google.common.collect.Range;
import com.lyh.common.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

/**
 * @author luo yihang
 * @date 2019/11/7 11:38
 */
@Slf4j
public class ShardingAlgorithmUtil {
    public static final String ERROR_MSG = "请选择分区键";

    public static List<String> doListSharding(ComplexKeysShardingValue<String> complexKeysShardingValue, String shardingKey) {
        List<String> keyList = (List<String>) complexKeysShardingValue.getColumnNameAndShardingValuesMap().get(shardingKey);
        if (CollectionUtils.isEmpty(keyList)) {
            keyList = (List<String>) complexKeysShardingValue.getColumnNameAndShardingValuesMap().get(shardingKey.toLowerCase());
            if (CollectionUtils.isEmpty(keyList)) {
                log.error(ERROR_MSG);
                throw new IllegalArgumentException(ERROR_MSG);
            }
        }
        List<String> result = new LinkedList<>();
        keyList.forEach(p -> result.add(complexKeysShardingValue.getLogicTableName() + "_" + p.hashCode() % 4));
        return result;
    }


    public static List<String> doRangeSharding(ComplexKeysShardingValue<String> complexKeysShardingValue, String shardingRangeKey, List<String> tableNamePreList) {
        List<String> result = new LinkedList<>();

        Collection<?> listDateValue = complexKeysShardingValue.getColumnNameAndShardingValuesMap().get(shardingRangeKey);
        if (CollectionUtils.isNotEmpty(listDateValue)) {
            tableNamePreList.forEach(p -> {
                for (Object date : listDateValue) {
                    result.add(p + "_" + DateUtil.formatDate((Date) date, DateUtil.YYYY_MM));
                }
            });
            return result;
        }
        Range keyRange = complexKeysShardingValue.getColumnNameAndRangeValuesMap().get(shardingRangeKey);
        if (null == keyRange || keyRange.isEmpty()) {
            log.error(ERROR_MSG);
            throw new IllegalArgumentException(ERROR_MSG);
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
