package com.lyh.sharding.table.util.sharding;

import com.lyh.common.exceptions.BaseRuntimeException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author luo yihang
 * @date 2019/11/5 16:58
 */
public class PersonShardingAlgorithm implements ComplexKeysShardingAlgorithm<String> {

    private static final String SHARDING_KEY = "userName";

    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<String> complexKeysShardingValue) {
        List<String> keyList = (List<String>) complexKeysShardingValue.getColumnNameAndShardingValuesMap().get(SHARDING_KEY);
        if (CollectionUtils.isEmpty(keyList)) {
            throw new BaseRuntimeException("请选择分区键");
        }
        Collection<String> result = new LinkedList<>();
        keyList.forEach(p -> result.add(complexKeysShardingValue.getLogicTableName() + "_" + p.hashCode() % 2));
        return result;
    }
}
