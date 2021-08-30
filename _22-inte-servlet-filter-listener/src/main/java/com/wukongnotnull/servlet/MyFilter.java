package com.wukongnotnull.servlet;
/* author: 悟空非空也（B站/知乎/公众号） */


import org.springframework.stereotype.Component;
import javax.servlet.*;
import java.io.IOException;

@Component
public class MyFilter implements Filter {



    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("悟空非空也在执行过滤操作。。。。");
        filterChain.doFilter(servletRequest,servletResponse);
    }


}