package com.syc.record.common.response;

public enum ResponseCode {
    SUCCESS(200,"success"),
    ERROR(500,"error") ;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
