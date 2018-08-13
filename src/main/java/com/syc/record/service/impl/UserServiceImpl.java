package com.syc.record.service.impl;

import com.syc.record.dao.UserMapper;
import com.syc.record.pojo.User;
import com.syc.record.service.IUserService;
import com.syc.record.vo.user.UserVo;

import java.sql.SQLException;

public class UserServiceImpl implements IUserService {
    private UserMapper userMapper;
    private static UserServiceImpl instance;
    public static UserServiceImpl getInstance(){
        if(instance == null)synchronized (UserServiceImpl.class){
            if(instance == null){
                instance = new UserServiceImpl();
            }
        }
        return instance;
    }
    private UserServiceImpl (){
        userMapper = new UserMapper();
    }

    @Override
    public int insert(User user) throws SQLException {
        return userMapper.insertUser(user.getUserName(),user.getPassword(),user.getNickName(),0);
    }

    @Override
    public UserVo query(String userName, String password) throws Exception {
        return userMapper.selectUser(userName,password);
    }
}
