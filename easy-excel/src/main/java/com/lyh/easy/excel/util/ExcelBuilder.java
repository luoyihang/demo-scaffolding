package com.lyh.easy.excel.util;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.google.common.collect.Lists;
import com.lyh.easy.excel.ExcelFileEnum;
import com.lyh.easy.excel.PersonModel;
import com.lyh.easy.excel.Test;
import com.lyh.easy.excel.util.data.ExcelDataFactory;

/**
 * @author luo yihang
 * @date 2020/4/3 16:58
 */
public class ExcelBuilder {

    public static <T> void write(Class<T> clazz, ExcelFileEnum excelFileEnum, ExcelDataFactory<T> excelDataFactory) {
        ExcelModel excelModel = new ExcelModel();
        String fileName = "C:\\Users\\BG345403\\Desktop\\a\\" + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
        excelModel.setFileNameList(Lists.newArrayList(fileName));
        // 写法2
        // 这里 需要指定写用哪个class去写
        ExcelWriter excelWriter = EasyExcel.write(fileName, clazz).build();
        WriteSheet writeSheet = EasyExcel.writerSheet(excelFileEnum.getDesc()).registerWriteHandler(new CustomSheetWriteHandler()).build();
        excelWriter.write(excelDataFactory.getExcelData(), writeSheet);

        // 千万别忘记finish 会帮忙关闭流
        excelWriter.finish();

        EasyExcel.write(fileName, clazz)
                .sheet(excelFileEnum.getDesc())
                .doWrite(excelDataFactory.getExcelData());

    }

    public static <T> ExcelWriter write(Class<T> clazz, ExcelFileEnum excelFileEnum) {
        ExcelModel excelModel = new ExcelModel();
        String fileName = "C:\\Users\\BG345403\\Desktop\\a\\" + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
        excelModel.setFileNameList(Lists.newArrayList(fileName));
        // 写法2
//        // 这里 需要指定写用哪个class去写
//        ExcelWriter excelWriter = EasyExcel.write(fileName, clazz).build();
//        WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
//
//        writeSheet = EasyExcel.writerSheet("模板").build();
//        excelWriter.write(dataList, writeSheet);
//        // 千万别忘记finish 会帮忙关闭流
//        excelWriter.finish();

        return EasyExcel.write(fileName, clazz).build();
    }

    public static <T> void write(ExcelFileEnum excelFileEnum, ExcelDataFactory<T> excelDataFactory) {

    }



}
