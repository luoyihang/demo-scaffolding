package com.lyh.easy.excel;

/**
 * @author luo yihang
 * @date 2020/4/3 18:51
 */
public enum ExcelFileEnum {
    /**
     * type 1
     */
    TYPE_1(1, "aa");

    ExcelFileEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private Integer type;
    private String desc;

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
