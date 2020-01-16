package com.example.ccb.utils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Cola
 * Date  2018/8/21 11:50
 *
 *
 * UUID生成工具类
 */
public class UuidUtils {

    //  定义所有的数字字符组成的串
    final static char[] numberChar = {
            '0' , '1' , '2' , '3' , '4' , '5' ,
            '6' , '7' , '8' , '9'
    };


    /**
     * 自动生成32位的UUid，对应数据库的主键id进行插入用。
     * @return
     */
    public static String getUUID() {

        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 产生长度为length的随机字符串（只包括数字）
     * @param length
     * @return
     */
    public static String getNumberId(int length) {
        StringBuffer respStr = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            respStr.append(numberChar[random.nextInt(10)]);
        }
        return respStr.toString();
    }



    public static String genOrderNo() {
            int i = (int) (Math.random() * 900) + 100;
            String MAX = String.valueOf(i);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
            String nowTime = sdf.format(new Date());
            nowTime += MAX;
            return nowTime;
    }

}
