package com.wukongnotnull.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//author: 悟空非空也（B站/知乎/公众号）
@SpringBootTest
class UserServiceTest {
    @Autowired
    private  UserService userService;

    @Test
    void findAll() {
        userService.findAll();
    }

    @Test
    public void addUser() {
        userService.addUser();
    }
}