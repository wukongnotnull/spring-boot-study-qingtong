package com.wukongnotnull.exception;

import com.wukongnotnull.utils.ParamsException;
import com.wukongnotnull.vo.HttpResult;
import com.wukongnotnull.vo.ResultCodeEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//author: 悟空非空也（B站/知乎/公众号）
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = {Exception.class})
    public HttpResult handleGlobalException(Exception e){
        HttpResult httpResult = null;
        if(e instanceof ParamsException){
            ParamsException paramsException = (ParamsException) e;
            if(paramsException.getType() == 520){
                httpResult = HttpResult.failure(ResultCodeEnum.USERNAME_REPEAT);
            }

        }else{
            httpResult = HttpResult.failure(ResultCodeEnum.WUKONG_ERROR);
            e.printStackTrace();
        }

        return httpResult;
    }
}
