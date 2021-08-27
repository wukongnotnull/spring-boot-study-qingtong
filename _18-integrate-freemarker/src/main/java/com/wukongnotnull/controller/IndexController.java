package com.wukongnotnull.controller;

import com.wukongnotnull.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
public class IndexController {
    // 学习成本低  使用的方式不变
   // @RequestMapping(value = "/wukong",method = RequestMethod.GET)
    @GetMapping(value = "/wukong")
    public String index(Model model){
        // 假装如下用户列表来源于数据库
        User wukong = new User("wukong", 100);
        User zhubajie = new User("zhubajie", 300);
        User tangseng = new User("tangseng", 30);
        User shaseng = new User("shaseng", 500);

        List userList = new ArrayList();
        List userList2 = new ArrayList();
        userList.add(wukong);
        userList.add(zhubajie);
        userList.add(tangseng);
        userList.add(shaseng);

        System.out.println(userList);

        model.addAttribute("userList",userList2);
        model.addAttribute("name","wukongnotnull");
        return "index";
    }

    @GetMapping("/userlist")
    public String showUserList(Model model){
        // 假装如下用户列表来源于数据库
        User wukong = new User("wukong", 100);
        User zhubajie = new User("zhubajie", 300);
        User tangseng = new User("tangseng", 30);
        User shaseng = new User("shaseng", 500);

        List userList = new ArrayList();
        userList.add(wukong);
        userList.add(zhubajie);
        userList.add(tangseng);
        userList.add(shaseng);

        System.out.println(userList);

        model.addAttribute("userList",userList);
        return "index";
    }




















}
