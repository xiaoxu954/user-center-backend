package com.xiaoxu.usercenterbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoxu.usercenterbackend.model.domain.User;
import com.xiaoxu.usercenterbackend.service.UserService;
import com.xiaoxu.usercenterbackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author xujihong
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-11-05 16:31:03
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




