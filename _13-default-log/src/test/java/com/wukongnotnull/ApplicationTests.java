package com.wukongnotnull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    //  自定义不同级别的日志
  private Logger logger=
            LoggerFactory.getLogger(ApplicationTests.class);
   //  debug --> info --->  warn ----> error
    // 针对于自定义的 debug 日志等级，需要在核心配置文件中进行配置
    @Test
    void contextLoads() {
      logger.warn(" 我是 warn 日志");
      logger.info("我是 info  日志");
      logger.debug(" 我是 debug 日志");
      logger.error("我是 error 日志");

    }

}
