package com.wukongnotnull.service;
//author: 悟空非空也（B站/知乎/公众号）

import com.wukongnotnull.annotation.InvokeLog;
import com.wukongnotnull.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @InvokeLog
    @Override
    public void findAll() {
        userMapper.findAll();
    }

    @InvokeLog
    public void addUser() {
        logger.info("info------>添加用户所有用户信息");

    }

}
