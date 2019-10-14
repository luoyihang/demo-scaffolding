package com.lyh.seata.dubbo.api.exception;

/**
 * @author luo yihang
 * @date 2019/10/14 9:47
 */
public class DubboException extends Exception {

    private static final long serialVersionUID = 6688260414952283782L;

    private String type;
    private String detail;

    public DubboException(String message) {
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
