package com.wukongnotnull.exception;
//author: 悟空非空也（B站/知乎/公众号）

import com.wukongnotnull.vo.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileNotFoundException;
import java.io.IOException;

@ControllerAdvice
public class GlobalExceptionHandler {


    // 处理所有异常
    @ExceptionHandler
    @ResponseBody
    public ResultInfo handleException(Exception e){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(520);
        resultInfo.setMsg("系统异常");
        resultInfo.setData(e.getClass());

        if(e instanceof ArithmeticException){
            resultInfo.setCode(523);
            resultInfo.setMsg("算术异常");
            resultInfo.setData(e.getClass());
        }else if(e instanceof FileNotFoundException){
            resultInfo.setCode(524);
            resultInfo.setMsg("文件未找到");
            resultInfo.setData(e.getClass());
        }

        return resultInfo;
    }
}
