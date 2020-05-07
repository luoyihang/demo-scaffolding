package com.lyh.sharding.table.config;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author luo yihang
 * @date 2019/11/5 16:58
 */
public class PersonShardingAlgorithm implements ComplexKeysShardingAlgorithm<String> {

    private static final String SHARDING_KEY = "userName";

    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<String> complexKeysShardingValue) {
        return ShardingAlgorithmUtil.doListSharding(complexKeysShardingValue, SHARDING_KEY);
    }
}
