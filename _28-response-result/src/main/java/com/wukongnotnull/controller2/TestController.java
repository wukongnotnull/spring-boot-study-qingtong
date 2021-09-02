package com.wukongnotnull.controller2;

import com.wukongnotnull.vo2.HttpResult;
import com.wukongnotnull.vo2.ResultCodeEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
public class TestController {
    // 成功，无 data
    @GetMapping("/success")
    @ResponseBody
    public HttpResult success(){
        return HttpResult.success();
    }

    // 成功，有data
    @GetMapping("/successwithData")
    @ResponseBody
    public HttpResult successWithData(){
        return HttpResult.success("我是悟空非空也");
    }

    // 失败，有具体提示错误信息
    @GetMapping("/failure")
    @ResponseBody
    public HttpResult failure(){
        // 因为文件未找到，返回提示信息
        return HttpResult.failure(ResultCodeEnum.NOT_FOUND);
    }

}
