package com.lyh.seata.dubbo.storage.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author luo yihang
 * @date 2019/10/14 9:32
 */
public interface StorageDao {

    int decreaseStorage(@Param("skuCode") String skuCode, @Param("storageNum") Integer storageNum);
}
