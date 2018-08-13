package com.syc.record.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoManager {
    private static DaoManager instance;
    private Connection connection;
    public static DaoManager getInstance(){
        if(instance == null)synchronized (DaoManager.class){
            if(instance == null){
                instance = new DaoManager();
            }
        }
        return instance;
    }

    private DaoManager() {
    }

    public synchronized Connection getConnection(){
        try {
            if(connection.isClosed()){
                openConnect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.connection;
    }

    public  void openConnect(){
        try {
            Class.forName(JDBCConfig.driver);
            connection = DriverManager.getConnection(JDBCConfig.url,JDBCConfig.userName,JDBCConfig.password);
            System.out.println("连接数据库成功");
        } catch (ClassNotFoundException e) {
            System.out.println("连接数据库失败:"+e.toString());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("连接数据库失败:"+e.toString());
            e.printStackTrace();
        }finally {
            //todo 数据库连接失败处理
        }

    }

   public void closeConnection(){
        if(connection != null){
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
   }

}
