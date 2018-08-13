package com.syc.record.common.response;

import com.google.gson.Gson;

public class ResponseData<T> {
    private int code;
    private String errorMsg;
    private T data;

    public ResponseData(int code) {
        this.code = code;
    }

    public ResponseData(int code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public ResponseData(int code, String errorMsg, T data) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
