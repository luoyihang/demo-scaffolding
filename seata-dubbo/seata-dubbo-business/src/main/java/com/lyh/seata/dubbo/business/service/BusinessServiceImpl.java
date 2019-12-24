package com.lyh.seata.dubbo.business.service;

import com.lyh.seata.dubbo.api.StorageOpenApi;
import com.lyh.seata.dubbo.api.exception.DubboException;
import com.lyh.seata.dubbo.business.dao.BusinessDao;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luo yihang
 * @date 2019/10/14 10:21
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Reference(version = "1.0")
    private StorageOpenApi storageOpenApi;

    @Autowired
    private BusinessDao businessDao;

    @Override
    public void doPurchase(Integer storageNum) throws DubboException {
        businessDao.addPurchaseOrder("001", storageNum);
        storageOpenApi.decreaseStorage("001", storageNum);
    }
}
