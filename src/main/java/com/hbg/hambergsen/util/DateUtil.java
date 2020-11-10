package com.hbg.hambergsen.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String dateformat = "yyyyMMddHHmmss";

    public static Date getDate(){
        return new Date();
    }

    public static String getTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(dateformat);
        return sdf.format(date);
    }


}
