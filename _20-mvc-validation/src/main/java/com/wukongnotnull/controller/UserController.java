package com.wukongnotnull.controller;

import com.wukongnotnull.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
public class UserController {

    @GetMapping("/register")
    public String showRegisterPage(){
        return "registerUser";
    }


   // 添加注解 @Valid 或者 @Validated 均可以
    // BindingResult 用于接收数据校验失败的提示信息
    @PostMapping(value = "/addUser")
    @ResponseBody
    public Object addUser(@Validated User user , BindingResult bindingResult){
        List<Object> list = new ArrayList<>();
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(e ->{
                list.add(e.getDefaultMessage());
            });
        }else {
            list.add("后端数据校验成功");
        }
        return list;
    }


}
