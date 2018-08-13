package com.syc.record.vo.user;

public class UserVo {
    private int role;
    private String email;
    private String userName;
    private String phone;
    private int id;

    public UserVo(int id,int role, String email, String userName, String phone) {
        this.id= id;
        this.role = role;
        this.email = email;
        this.userName = userName;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
