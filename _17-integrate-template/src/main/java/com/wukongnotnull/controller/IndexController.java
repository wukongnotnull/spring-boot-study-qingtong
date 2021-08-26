package com.wukongnotnull.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
public class IndexController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginPage(){
        return "login";  //逻辑视图名
    }

    @RequestMapping(value = "/toLoginPage",method = RequestMethod.GET)
    public String toLoginPage(Model model){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        model.addAttribute("currentYear",currentYear);
        return "login";
    }
    @RequestMapping("/shaseng")
    public String index(){
        return "home";  //逻辑视图名
    }


}
