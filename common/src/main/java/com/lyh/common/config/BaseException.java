package com.lyh.common.config;

/**
 * @author luo yihang
 * @date 2019/10/14 9:38
 */
public class BaseException extends Exception {
    private static final long serialVersionUID = 7754644962781255010L;

    private String type;
    private String detail;

    public BaseException(String message) {
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
