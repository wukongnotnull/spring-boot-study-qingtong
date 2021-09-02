package com.wukongnotnull.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//author: 悟空非空也（B站/知乎/公众号）
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }


}
