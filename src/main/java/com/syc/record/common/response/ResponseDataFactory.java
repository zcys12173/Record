package com.syc.record.common.response;

public class ResponseDataFactory {

    public static<T> ResponseData createSuccessResponseData(){
        return new ResponseData<T>(ResponseCode.SUCCESS.getCode(),"",null);
    }
    public static<T> ResponseData createSuccessResponseData(T data){
        return new ResponseData<T>(ResponseCode.SUCCESS.getCode(),"",data);
    }

    public static<T> ResponseData createErrorResponseData(String errorMsg){
        return new ResponseData<T>(ResponseCode.ERROR.getCode(),errorMsg);
    }

    public static<T> ResponseData createErrorResponseData(int code, String errorMsg){
        return new ResponseData<T>(code,errorMsg);
    }
}
