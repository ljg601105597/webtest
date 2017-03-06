package com.test.util.string;


/**
 *
 * String字符串的操作工具类
 *
 */
public class StringUtil {

    /**
     * 判断字符串s是否为空
     * @param s 参数
     * */
    public static boolean isBlank(String s){
        if(s==null){
            return true;
        }
        s=s.trim();
        if(s.length()==0){
            return true;
        }
        return false;
    }

    /**
     * 判断字符串s是否为空
     * @param s 参数
     * */
    public static boolean isNotBlank(String s){
        return !isBlank(s);
    }

}
