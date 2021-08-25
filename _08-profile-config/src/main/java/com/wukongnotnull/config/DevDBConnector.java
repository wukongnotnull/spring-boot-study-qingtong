package com.wukongnotnull.config;
//author: 悟空非空也（B站/知乎/公众号）

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = {"dev"})
public class DevDBConnector implements DBConnector {

    // 数据库连接配置
    public void configuration() {
        System.out.println("开发环境下连接Mysql数据库，连接成功");
    }
}
