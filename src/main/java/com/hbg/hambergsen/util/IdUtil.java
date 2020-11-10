package com.hbg.hambergsen.util;

import com.hbg.hambergsen.constant.ParamConstant;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;

public class IdUtil {

    // 生成订单Id (AIR16050183078746A3Bl)
    public static String generatorId(String prefix){
        StringBuffer sb = new StringBuffer();
        sb.append(prefix);
        Date date = DateUtil.getDate();
        sb.append(DateUtil.getTime(date));
        //生成指定长度的字母和数字的随机组合字符串
        String s = RandomStringUtils.randomAlphanumeric(4);
        sb.append(s);
        return sb.toString();
    }

    /*public static void main(String[] args) {
        System.out.println(generatorId(ParamConstant.AIR_PREFIX));
    }*/
}
