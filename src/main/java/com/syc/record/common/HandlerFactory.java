package com.syc.record.common;

public class HandlerFactory {
    public static <T> T createHandler(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
