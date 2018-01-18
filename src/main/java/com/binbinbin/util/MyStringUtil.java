package com.binbinbin.util;

/**
 * Created by bin on 2018/1/18.
 */
public class MyStringUtil {
    public static boolean isNotEmpty(String str){
        return null!=str&&"".equals(str);
    }
    public static Integer valueOf(String value, int def) {
        try {
            if (isNotEmpty(value)) {
                return Integer.parseInt(value);
            }
        } catch (Exception e) {
            return def;
        }
        return def;
    }
}
