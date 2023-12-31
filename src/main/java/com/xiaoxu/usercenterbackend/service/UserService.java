package com.xiaoxu.usercenterbackend.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxu.usercenterbackend.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xujihong
 * @description 针对表【user(用户表)】的数据库操作Service
 * @createDate 2023-11-05 16:31:03
 */
public interface UserService extends IService<User> {


    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);



    /**
     * 用户脱敏方法
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    int userLogout(HttpServletRequest request);
}
