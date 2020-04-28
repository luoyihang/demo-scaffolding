package com.lyh.seata.dubbo.business.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author luo yihang
 * @date 2019/10/14 9:32
 */
public interface BusinessDao {

    /**
     * 创建订单
     *
     * @param skuCode
     * @param purchaseNum
     */
    void addPurchaseOrder(@Param("skuCode") String skuCode, @Param("purchaseNum") Integer purchaseNum);
}
