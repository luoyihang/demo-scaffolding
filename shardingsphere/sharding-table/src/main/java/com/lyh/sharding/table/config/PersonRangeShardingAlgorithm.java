package com.lyh.sharding.table.config;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

/**
 * @author luo yihang
 * @date 2019/11/5 16:58
 */
public class PersonRangeShardingAlgorithm implements ComplexKeysShardingAlgorithm<String> {

    private static final String SHARDING_KEY = "userName";
    private static final String SHARDING_RANGE_KEY = "createTime";

    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<String> complexKeysShardingValue) {
        List<String> tableNamePreList = ShardingAlgorithmUtil.doListSharding(complexKeysShardingValue, SHARDING_KEY);
        return ShardingAlgorithmUtil.doRangeSharding(complexKeysShardingValue, SHARDING_RANGE_KEY, tableNamePreList);
    }
}
