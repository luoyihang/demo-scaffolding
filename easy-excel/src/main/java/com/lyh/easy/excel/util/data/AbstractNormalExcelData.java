package com.lyh.easy.excel.util.data;

import java.util.List;

/**
 * @author luo yihang
 * @date 2020/4/3 18:54
 */
public abstract class AbstractNormalExcelData<T> implements ExcelDataFactory<T> {

    @Override
    public List<T> getExcelData() {
        throw new IllegalArgumentException("");
    }
}
