package nju.hackathon.njucourseevaluation.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {

    /**
     * 从yyyyMMdd格式的日期字符串中获得该日期为星期几
     */
    public static int GetDayOfWeek(String dateStr) {
        Calendar calendar = Calendar.getInstance();
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = format.parse(dateStr);
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }
}
