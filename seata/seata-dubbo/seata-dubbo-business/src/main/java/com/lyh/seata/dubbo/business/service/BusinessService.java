package com.lyh.seata.dubbo.business.service;

import com.lyh.seata.dubbo.api.exception.DubboException;

/**
 * @author luo yihang
 * @date 2019/10/14 10:23
 */
public interface BusinessService {

    void doPurchase(Integer num) throws DubboException;
}
