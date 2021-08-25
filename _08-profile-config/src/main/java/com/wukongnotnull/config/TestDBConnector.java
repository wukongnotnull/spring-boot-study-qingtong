package com.wukongnotnull.config;
//author: 悟空非空也（B站/知乎/公众号）

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "test")
public class TestDBConnector implements  DBConnector{

    /**
     * 在测试环境下，数据库连接配置
     */
    @Override
    public void configuration() {
        System.out.println("测试环境下，连接Sqlite数据库，连接成功");
    }
}
