package com.wukongnotnull.controller2;

import com.wukongnotnull.domain.User;
import com.wukongnotnull.vo.ResponseResult;
import com.wukongnotnull.vo2.HttpResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
@RequestMapping("/api/v2")
public class UserV2Controller {

    // 查询用户列表
    @GetMapping("/users")
    @ResponseBody
    public HttpResult<Object> getUserList(){
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

     return    HttpResult.success(userList);


    }

    // 根据id 查询用户信息
    @GetMapping("/users/{id}")
    @ResponseBody
    public HttpResult<Object> getUserList(@PathVariable("id") Integer id){
        // 编造一个用户
        User user1 = new User();
        user1.setId(1);
        user1.setName("tangseng");
        user1.setAge(18);

      return   HttpResult.success(user1);

    }

    // 添加用户
    @PostMapping("/users")
    @ResponseBody
    public HttpResult<Object> addUser(@RequestBody User user){
       // 1 假装把 user 保存到数据库中并且保存成功

        // 2 .....
     return    HttpResult.success(user);

    }


    // 修改用户信息
    @PutMapping(value = "/users")
    @ResponseBody
    public HttpResult<Object> modifyUser(@RequestBody User user){
        // 假装修改了数据库中指定id的用户信息
        User user1 = new User();
        user1.setId(1);
        user1.setName("shaseng");
        user1.setAge(18);
        // 模拟进行修改
        user1.setName(user.getName());

     return    HttpResult.success(user1);

    }

    // 删除用户
    @DeleteMapping(value = "/users/{id}")
    @ResponseBody
    public HttpResult<Object> DeleteUser(@PathVariable("id") Integer id){
        // 假装删除了数据库中指定id的用户信息

       return HttpResult.success();


    }

}
