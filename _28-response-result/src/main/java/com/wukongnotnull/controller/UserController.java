package com.wukongnotnull.controller;

import com.wukongnotnull.domain.User;
import com.wukongnotnull.vo.ResponseResult;
import com.wukongnotnull.vo2.HttpResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
@RequestMapping("/api/v1")
public class UserController {

    // 查询用户列表
    @GetMapping("/users")
    @ResponseBody
    public ResponseResult getUserList(){
        // 编造一个用户列表
        User user1 = new User();
        user1.setId(1);
        user1.setName("wukong");
        user1.setAge(18);
        User user2 = new User();
        user2.setId(2);
        user2.setName("zhubajie");
        user2.setAge(20);
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        ResponseResult responseResult = new ResponseResult();
        responseResult.setSuccess(true);
        responseResult.setCode(200);
        responseResult.setData(userList);

        return responseResult;
    }

    // 根据id 查询用户信息
    @GetMapping("/users/{id}")
    @ResponseBody
    public ResponseResult getUserList(@PathVariable("id") Integer id){
        // 编造一个用户
        User user1 = new User();
        user1.setId(1);
        user1.setName("tangseng");
        user1.setAge(18);

        ResponseResult responseResult = new ResponseResult();
        responseResult.setSuccess(true);
        responseResult.setCode(200);
        responseResult.setData(user1);

        return responseResult;
    }

    // 添加用户
    @PostMapping("/users")
    @ResponseBody
    public ResponseResult addUser(@RequestBody User user){
       // 1 假装把 user 保存到数据库中并且保存成功

        // 2 .....
        ResponseResult responseResult = new ResponseResult();
        responseResult.setSuccess(true);
        responseResult.setCode(200);
        responseResult.setData(user);

        return responseResult;
    }


    // 修改用户信息
    @PutMapping(value = "/users")
    @ResponseBody
    public ResponseResult modifyUser(@RequestBody User user){
        // 假装修改了数据库中指定id的用户信息
        User user1 = new User();
        user1.setId(1);
        user1.setName("shaseng");
        user1.setAge(18);
        // 模拟进行修改
        user1.setName(user.getName());

        ResponseResult responseResult = new ResponseResult();
        responseResult.setSuccess(true);
        responseResult.setCode(200);
        responseResult.setData(user1);
        return responseResult;
    }

    // 删除用户
    @DeleteMapping(value = "/users/{id}")
    @ResponseBody
    public ResponseResult DeleteUser(@PathVariable("id") Integer id){
        // 假装删除了数据库中指定id的用户信息
      // HttpResult httpResult = new HttpResult();
        HttpResult<Object> success = HttpResult.success();

        ResponseResult responseResult = new ResponseResult();
        responseResult.setSuccess(true);
        responseResult.setCode(200);
        responseResult.setData(null);
        return responseResult;
    }

}
