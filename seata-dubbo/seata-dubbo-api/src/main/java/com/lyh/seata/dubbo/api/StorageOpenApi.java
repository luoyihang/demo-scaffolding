package com.lyh.seata.dubbo.api;

import com.lyh.seata.dubbo.api.exception.DubboException;
import com.lyh.seata.dubbo.api.response.BaseResponse;

/**
 * @author luo yihang
 * @date 2019/10/12 15:50
 */
public interface StorageOpenApi {

    /**
     * 扣减库存
     *
     * @param skuCode
     * @param storageNum
     * @return
     */
    BaseResponse<String> decreaseStorage(String skuCode, Integer storageNum) throws DubboException;
}
