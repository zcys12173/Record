package com.syc.record.handler.user;

import com.syc.record.common.response.ResponseData;
import com.syc.record.common.response.ResponseDataFactory;
import com.syc.record.common.response.ResponseHandler;
import com.syc.record.pojo.User;
import com.syc.record.service.impl.UserServiceImpl;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class RegisterHandler extends ResponseHandler{

    @Override
    protected ResponseData getResponseData(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if(StringUtils.isBlank(userName) || StringUtils.isBlank(password)){
            return  ResponseDataFactory.createErrorResponseData("用户名或密码不能为空");
        }
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        try {
            int count = UserServiceImpl.getInstance().insert(user);
            if(count != 0){
                return ResponseDataFactory.createSuccessResponseData();
            }else{
                return  ResponseDataFactory.createErrorResponseData("注册失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return  ResponseDataFactory.createErrorResponseData(e.toString());
        }

    }
}
