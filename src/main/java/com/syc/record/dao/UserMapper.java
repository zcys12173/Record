package com.syc.record.dao;

import com.syc.record.pojo.User;
import com.syc.record.utils.DateUtils;
import com.syc.record.utils.LogUtils;
import com.syc.record.vo.user.UserVo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 真实操作数据库User表
 */
public class UserMapper {
    public int insertUser(String userName, String password, String nickName, int role) throws SQLException {
        String createTime = DateUtils.dateFormat(System.currentTimeMillis());
        String updateTime = DateUtils.dateFormat(System.currentTimeMillis());

        String sql = "insert into user (username,password,role,create_time,update_time)" +
                " values (\"" + userName + "\",\"" + password + "\"," + role + ",\"" + createTime + "\",\"" + updateTime + "\")";
        LogUtils.d("UserMapper", sql);
        Statement statement = DaoManager.getInstance().getConnection().createStatement();
        int result = statement.executeUpdate(sql);
        System.out.println("插入用户操作结果：" + result);
        return result;
    }


    public UserVo selectUser(String userName, String password) throws SQLException {
        String sql = "select * from user where userName=\""+userName+"\" and password=\""+password+"\" limit 1";
        LogUtils.d("loginSql",sql);
        Statement statement = DaoManager.getInstance().getConnection().createStatement();
        ResultSet result =  statement.executeQuery(sql);
        if(result.first()){
            int id = result.getInt(1);
            String email = result.getString(4);
            String phone = result.getString(5);
            int role = result.getInt(8);
            UserVo user = new UserVo(id,role,email,userName,phone);
            return user;
        }else{
            return null;
        }

    }
}
