package com.lyh.sharding.table.config;

import com.google.common.collect.Range;
import com.lyh.common.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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
            log.error(ERROR_MSG);
            throw new IllegalArgumentException(ERROR_MSG);
        }
        List<String> result = new LinkedList<>();
        keyList.forEach(p -> result.add(complexKeysShardingValue.getLogicTableName() + "_" + p.hashCode() % 4));
        return result;
    }

    public static void main(String[] args) {
        String a = "1";
        String b = "3";
        System.out.println(a.hashCode() % 2);
        System.out.println(b.hashCode() % 2);

        System.out.println(a.hashCode() % 4);
        System.out.println(b.hashCode() % 4);
    }

    public static List<String> doRangeSharding(ComplexKeysShardingValue<String> complexKeysShardingValue, String shardingRangeKey, List<String> tableNamePreList) {
        Range keyRange = complexKeysShardingValue.getColumnNameAndRangeValuesMap().get(shardingRangeKey);
        if (null == keyRange || keyRange.isEmpty()) {
            log.error(ERROR_MSG);
            throw new IllegalArgumentException(ERROR_MSG);
        }
        List<String> result = new LinkedList<>();
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
