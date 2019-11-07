package com.lyh.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author luo yihang
 * @date 2019/11/7 10:56
 */
public class DateUtil {

    public static final String YYYY_MM = "yyyyMM";

    /**
     * 格式化 date
     *
     * @param date   需要格式化的时间
     * @param format 格式化格式
     * @return 格式化后String类型的Date
     */
    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        if (date == null) {
            return "";
        }
        return sdf.format(date);
    }

    /**
     * 格式化date，到月份维度
     *
     * @param date 时间
     * @return 格式化到月份的 calendar
     */
    public static Calendar initCalendarMonth(Date date) {
        Calendar result = Calendar.getInstance();
        result.setTime(date);
        result.set(Calendar.DAY_OF_MONTH, 1);
        result.set(Calendar.HOUR_OF_DAY, 0);
        result.set(Calendar.MINUTE, 0);
        result.set(Calendar.SECOND, 0);
        result.set(Calendar.MILLISECOND, 0);
        return result;
    }
}
