package com.wukongnotnull.mapper;

import com.wukongnotnull.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

//author: 悟空非空也（B站/知乎/公众号）
@Repository
public class UserMapperImpl implements  UserMapper {

    public static final Logger logger =
            LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void findAll() {
        logger.info("在数据库中，查找所有用户");

    }
}
