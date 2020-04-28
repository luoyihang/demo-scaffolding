package com.lyh.easy.excel.util;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.lyh.easy.excel.ExcelFileEnum;
import com.lyh.easy.excel.util.data.ExcelDataFactory;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author luo yihang
 * @date 2020/4/7 8:40
 */
public class DemoEasyExcel {

    private static ExcelWriterBuilder write(ExcelFileEnum excelFileEnum, Class<?> clazz) {
        String fileName = "C:\\Users\\BG345403\\Desktop\\a\\" + excelFileEnum.getDesc() + System.currentTimeMillis() + ".xlsx";
        return EasyExcelFactory.write(fileName, clazz);
    }

    public static <T> void write(ExcelFileEnum excelFileEnum, Class<?> clazz, ExcelDataFactory<T> excelDataFactory) {
        ExcelWriterSheetBuilder writerSheetBuilder = write(excelFileEnum, clazz).sheet(excelFileEnum.getDesc());
        // before
        List<T> excelData;
        while (CollectionUtils.isNotEmpty(excelData = excelDataFactory.getExcelData())) {
            writerSheetBuilder.doWrite(excelData);
            AtomicInteger startAtomic = new AtomicInteger();
            int length = 10;
            startAtomic.addAndGet(length);
        }
        // after
    }

}
