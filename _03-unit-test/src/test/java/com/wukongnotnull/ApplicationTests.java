package com.wukongnotnull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("悟空非空也 在学习");
        System.out.println("我的个人网站: wukongnotnull.com");

    }


    @Test
    void userAddTest(){
        System.out.println("用户添加成功");
    }

    @Test
    void  userDeleteTest(){
        System.out.println("用户删除成功");
    }

    @Test
    void userModifyTest(){
        System.out.println("用户修改成功");
    }

    @Test
    void userQueryTest(){
        System.out.println("用户查询成功");
    }


}
