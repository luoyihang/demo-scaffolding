package com.lyh.sharding.table.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author luo yihang
 * @date 2019/12/27 9:56
 */
public class DatabaseShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        return "test" + preciseShardingValue.getValue().hashCode() % 2;
    }
}
