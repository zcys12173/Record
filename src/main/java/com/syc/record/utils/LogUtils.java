package com.syc.record.utils;

public class LogUtils {
    public static final boolean DEBUG = true;
    public static void d(String tag,String msg){
        if (DEBUG) {
            System.out.println(msg);
        }
    }

    public static void i(String tag,String msg){
        if (DEBUG) {
            System.out.println(msg);
        }
    }

    public static void e(String tag,String msg){
        if (DEBUG) {
            System.out.println(msg);
        }
    }

}
