package com.wukongnotnull.servlet;
/* author: 悟空非空也（B站/知乎/公众号） */


import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Component
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContextListener  开始初始化.....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextListener  销毁掉.....");
    }
}