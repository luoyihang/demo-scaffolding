package com.lyh.easy.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author luo yihang
 * @date 2020/3/18 13:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonModel {
    @DateTimeFormat
    @ExcelProperty(value = "名字", index = 0)
    private String name;
    @ExcelProperty(value = "含税金额", index = 1)
    private BigDecimal amount;
    @ExcelProperty(value = "去税金额金额", index = 2)
    private BigDecimal amountNoTax;
}
