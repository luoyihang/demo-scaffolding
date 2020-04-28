package com.lyh.easy.excel;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.lyh.easy.excel.util.DemoEasyExcel;
import com.lyh.easy.excel.util.data.AbstractNormalExcelData;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author luo yihang
 * @date 2020/3/18 13:29
 */
public class Test {

    public static void main(String[] args) {

        DemoEasyExcel.write(ExcelFileEnum.TYPE_1, PersonModel.class, new AbstractNormalExcelData<PersonModel>() {
            @Override
            public List<PersonModel> getExcelData() {
                List<PersonModel> list = new ArrayList<>();
                PersonModel model = new PersonModel();
                model.setName("    哈哈哈");
                model.setAmount(BigDecimal.ZERO);
                BigDecimal bigDecimal = BigDecimal.valueOf(0.00000001);
                model.setAmountNoTax(bigDecimal.add(BigDecimal.ZERO).setScale(10, BigDecimal.ROUND_DOWN));
                list.add(model);

                PersonModel model2 = new PersonModel();
                model2.setName("    哈哈哈");
                model2.setAmount(BigDecimal.ZERO);
                model2.setAmountNoTax(BigDecimal.valueOf(1));
                list.add(model2);
                return list;
            }
        });

        // 内容的策略
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        // 这里需要指定 FillPatternType 为FillPatternType.SOLID_FOREGROUND 不然无法显示背景颜色.头默认了 FillPatternType所以可以不指定
        contentWriteCellStyle.setFillPatternType(FillPatternType.SOLID_FOREGROUND);
        // 背景绿色
        contentWriteCellStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        WriteFont contentWriteFont = new WriteFont();
        // 字体大小
        contentWriteFont.setFontHeightInPoints((short) 20);
        contentWriteCellStyle.setWriteFont(contentWriteFont);

        HorizontalCellStyleStrategy horizontalCellStyleStrategy =
                new HorizontalCellStyleStrategy(null, contentWriteCellStyle);

//        String fileName = "C:\\Users\\BG345403\\Desktop\\a\\" + "simpleWrite" + System.currentTimeMillis() + ".zip";
//        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
//        // 如果这里想使用03 则 传入excelType参数即可
//        EasyExcel.write(fileName, MyTestExportModel.class).registerWriteHandler(new SheetWriteHandler() {
//            @Override
//            public void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
//                writeSheetHolder.globalConfiguration().setAutoTrim(false);
//            }
//            @Override
//            public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
//            }
//        }).sheet("模板").doWrite(list);

//        String fileName1 = "C:\\Users\\BG345403\\Desktop\\a\\" + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
//
//        EasyExcel.write(fileName1, PersonModel.class).sheet("模板").doWrite(list);


//
//        String zipFile = "C:\\Users\\BG345403\\Desktop\\a\\" + "simpleWrite" + System.currentTimeMillis() + ".zip";
//        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile))) {
//            File file;
//            byte[] data = new byte[1024];
//            int count;
//            for (String path : localFilePaths) {
//                file = new File(path);
//                if (!file.exists()) {
//                    continue;
//                }
//                try (InputStream input = new FileInputStream(file)) {
//                    zipOut.putNextEntry(new ZipEntry(file.getName()));
//                    while ((count = input.read(data)) != -1) {
//                        zipOut.write(data, 0, count);
//                    }
//                }
//            }
//            System.out.println(1);
//        } catch (Exception e) {
//        }finally {
//            System.out.println(1);
//
//        }

//
//
//        // 这里 需要指定写用哪个class去写
//        ExcelWriter excelWriter = EasyExcel.write(fileName, MyTestExportModel.class).build();
//        // 这里注意 如果同一个sheet只要创建一次
//        WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
//
//        // 去调用写入,这里我调用了五次，实际使用时根据数据库分页的总的页数来
//        for (int i = 0; i < 5; i++) {
//            // 分页去数据库查询数据 这里可以去数据库查询每一页的数据
//            excelWriter.write(list, writeSheet);
//        }
//        /// 千万别忘记finish 会帮忙关闭流
//        excelWriter.finish();
    }
}
