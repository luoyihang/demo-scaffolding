package com.lyh.easy.excel.util.data;

import java.util.List;

/**
 * @author luo yihang
 * @date 2020/4/3 18:53
 */
public interface ExcelDataFactory<T> {
    /**
     * 获取数据
     *
     * @return
     */
    List<T> getExcelData();
}
