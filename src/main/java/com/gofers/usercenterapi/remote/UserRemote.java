package com.gofers.usercenterapi.remote;

import com.gofers.usercenterapi.entity.UserInfo;

import java.util.List;

public interface UserRemote {


    /**
     * 通过userId 获取userInfo
     * @param userId userId
     * @return userInfo
     *
     */
    UserInfo findByUserId(String userId);
}
