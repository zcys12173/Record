package com.syc.record.handler.user;

import com.syc.record.common.response.ResponseData;
import com.syc.record.common.response.ResponseDataFactory;
import com.syc.record.common.response.ResponseHandler;
import com.syc.record.service.impl.UserServiceImpl;
import com.syc.record.vo.user.UserVo;

import javax.servlet.http.HttpServletRequest;


public class LoginHandler extends ResponseHandler {

    @Override
    protected ResponseData getResponseData(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        try {
            UserVo result = UserServiceImpl.getInstance().query(userName,password);
            if(result != null){
                return ResponseDataFactory.createSuccessResponseData(result);
            }else{
                return ResponseDataFactory.createErrorResponseData("用户名或密码错误");
            }

        } catch (Exception e) {
            return ResponseDataFactory.createErrorResponseData(e.toString());
        }
    }
}
