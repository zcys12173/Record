package com.syc.record.service;


import com.syc.record.pojo.User;
import com.syc.record.vo.user.UserVo;

import java.sql.SQLException;

public interface IUserService {

    int insert(User user) throws Exception;

    UserVo query(String userName,String password) throws Exception;
}
