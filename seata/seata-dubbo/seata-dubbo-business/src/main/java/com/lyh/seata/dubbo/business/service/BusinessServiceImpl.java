package com.lyh.seata.dubbo.business.service;

import com.lyh.seata.dubbo.api.StorageOpenApi;
import com.lyh.seata.dubbo.api.exception.DubboException;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author luo yihang
 * @date 2019/10/14 10:21
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Reference(version = "1.0")
    private StorageOpenApi storageOpenApi;

    @Override
    public void doPurchase(Integer num) throws DubboException {
        storageOpenApi.decreaseStorage("001", num);
    }
}
