package com.gofers.usercenterapi.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 73956
 */


public class UserInfo {

    private String userName;

    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
