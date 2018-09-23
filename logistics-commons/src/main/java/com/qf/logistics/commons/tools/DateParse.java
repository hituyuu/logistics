package com.qf.logistics.commons.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 123 on 2018/9/7.
 */
public class DateParse {
    private static SimpleDateFormat dateFormat;
    static {
        dateFormat=new SimpleDateFormat("yy-MM-dd");
    }
    public static Date stringToDate(String dateStr){
        Date date=null;
        try {
            date =dateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static String dateToSring(Date date){
        String dateString=dateFormat.format(date);

        return dateString;
    }
}
