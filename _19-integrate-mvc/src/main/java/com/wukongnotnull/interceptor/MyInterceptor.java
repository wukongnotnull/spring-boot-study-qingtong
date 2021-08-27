package com.wukongnotnull.interceptor;
//author: 悟空非空也（B站/知乎/公众号）

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class MyInterceptor implements HandlerInterceptor {
    // 编写一个拦截器：规定哪些进入拦截器的请求可以通过或者阻止
    // 请求进方法之前进行拦截
    // localhost:8080/home  ------>home.html 文件 ---》浏览器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //制定拦截的规则 ： 什么时候阻止通行，什么时候放行
        // 当你已经登录了，可以访问管理员后台主页， 没有登录，不能主页
        // 若是登录成功，我们会把个人信息存入 session
        Object loginUser = request.getSession().getAttribute("userSession");
        if (loginUser == null) { // 未登录
            response.sendRedirect(request.getContextPath() + "/login");
            // 阻止访问
            return false;
        }
        // 放行
        return true;
    }
}



