package com.lyh.seata.dubbo.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author luo yihang
 * @date 2019/10/12 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 5651441983595039846L;

    private static final Integer SUCCESS_STATUS = 200;

    private T data;

    private Integer status;


    public BaseResponse(T data) {
        this.data = data;
        this.status = SUCCESS_STATUS;
    }
}
