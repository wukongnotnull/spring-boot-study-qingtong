package com.wukongnotnull.config;
//author: 悟空非空也（B站/知乎/公众号）

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = {"prod"})
public class ProDBConnector implements DBConnector {

    /**
     * 生产环境下，数据库连接配置
     */
    public void configuration() {
        System.out.println("在生产环境下，连接Oracle数据库,连接成功");
    }
}
