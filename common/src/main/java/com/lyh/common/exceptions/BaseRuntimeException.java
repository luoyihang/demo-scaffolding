package com.lyh.common.exceptions;

/**
 * @author luo yihang
 * @date 2019/11/7 10:49
 */
public class BaseRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 6781995447429082310L;

    private String type;
    private String detail;

    public BaseRuntimeException(String message) {
        super(message);
        this.type = "";
        this.detail = message;
    }

    public String getType() {
        return type;
    }

    public String getDetail() {
        return detail;
    }
}
