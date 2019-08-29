package com.wxjtest0700;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

public class Demo07 {
    public static void main(String[] args) throws IOException, ParseException {
        Properties properties = new Properties();
        properties.setProperty("1993-08-10", "小刚");
        properties.setProperty("1996-10-10", "小智");
        properties.setProperty("1995-04-01", "武藏");
        FileWriter fw = new FileWriter("D:\\IdeaProject\\JavaSE\\Test\\src\\com\\wxjtest0700\\data.txt");
        properties.store(fw, null);
        fw.close();
        Set<Object> objects = properties.keySet();
        for (Object object : objects) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse((String) object);
            int age = getAgeByBirth(date);
            Object o = properties.get(object);
            System.out.println(o + "生日是:" + object + ",年龄" + age);
        }
    }

    public static int getAgeByBirth(Date birthDay) {
        int age = 0;
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) { //出生日期晚于当前时间，无法计算
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);  //当前年份
        int monthNow = cal.get(Calendar.MONTH);  //当前月份
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); //当前日期
        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        age = yearNow - yearBirth;   //计算整岁数
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;//当前日期在生日之前，年龄减一
            } else {
                age--;//当前月份在生日之前，年龄减一
            }
        }
        return age;
    }
}
