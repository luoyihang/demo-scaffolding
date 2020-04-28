package com.lyh.easy.excel.util;

import com.alibaba.excel.write.handler.SheetWriteHandler;

/**
 * @author luo yihang
 * @date 2020/4/3 17:37
 */
public class CustomHandlerFactory {

    public static SheetWriteHandler notTrimBuilder() {
        return new CustomSheetWriteHandler();
    }

}
