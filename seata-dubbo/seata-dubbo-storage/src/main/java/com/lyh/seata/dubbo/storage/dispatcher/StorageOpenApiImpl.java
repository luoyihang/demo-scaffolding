package com.lyh.seata.dubbo.storage.dispatcher;

import com.lyh.seata.dubbo.api.StorageOpenApi;
import com.lyh.seata.dubbo.api.exception.DubboException;
import com.lyh.seata.dubbo.api.response.BaseResponse;
import com.lyh.seata.dubbo.storage.dao.StorageDao;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author luo yihang
 * @date 2019/10/14 9:22
 */
@Service(version = "1.0", timeout = 3000, protocol = "dubbo", cluster = "failfast")
public class StorageOpenApiImpl implements StorageOpenApi {

    @Autowired
    private StorageDao storageDao;

    @Override
    public BaseResponse<String> decreaseStorage(String skuCode, Integer storageNum) throws DubboException {
        int result = storageDao.decreaseStorage(skuCode, storageNum);
        if (result <= 0) {
            throw new DubboException("库存扣减失败");
        }
        return new BaseResponse<>("成功");
    }
}
