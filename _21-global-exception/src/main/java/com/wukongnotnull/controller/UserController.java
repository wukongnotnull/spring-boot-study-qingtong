package com.wukongnotnull.controller;


import com.wukongnotnull.domain.User;
import com.wukongnotnull.vo.ResultInfo;
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
        return "registerUser";  //viewname
    }

    @PostMapping(value = "/addUser")
    @ResponseBody
    public ResultInfo addUser(@Validated User user){
        ResultInfo resultInfo = new ResultInfo();

        resultInfo.setCode(521);
        resultInfo.setMsg("用户添加成功");
        resultInfo.setData(user);

        return resultInfo;
    }

    // method :  post 添加； get  查询； delete 删除； put  修改
    @GetMapping(value = "/test")
    @ResponseBody
    public ResultInfo test(){
        ResultInfo resultInfo = new ResultInfo();
        // 人为的制造一个异常
        int i= 10/0;
        resultInfo.setCode(522);
        resultInfo.setMsg("test 成功");

        return resultInfo;
    }

   // 添加注解 @Valid 或者 @Validated 均可以
    // BindingResult 用于接收数据校验失败的提示信息
    /*@PostMapping(value = "/addUser")
    @ResponseBody
    public ResultInfo addUser(@Validated User user , BindingResult bindingResult){
        ResultInfo resultInfo = new ResultInfo();
        List<Object> list = new ArrayList<>();
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(e ->{
                list.add(e.getDefaultMessage());
            });
        }else {
            list.add("后端数据校验成功");
        }
        resultInfo.setCode(1314);
        resultInfo.setMsg("注册异常");
        resultInfo.setData(list);
        return resultInfo;
    }*/



}
