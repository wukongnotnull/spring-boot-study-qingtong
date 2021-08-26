package com.wukongnotnull.service;
//author: 悟空非空也（B站/知乎/公众号）


import com.wukongnotnull.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void findAll() {
        userMapper.findAll();
    }


    //增删改上添加 该注解即可 （查询不需要）

    public void addUser() {
        logger.info("info------>添加用户所有用户信息");

    }

}
