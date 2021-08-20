package com.wukongnotnull.controller;
//author: 悟空非空也（B站/知乎/公众号）


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "hello , wukongnotnull, 你好， 悟空非空也，大家好好上课，不要挂机";
    }

}
