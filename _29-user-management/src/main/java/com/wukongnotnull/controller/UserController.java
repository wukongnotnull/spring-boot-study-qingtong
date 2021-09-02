package com.wukongnotnull.controller;

import com.wukongnotnull.domain.User;
import com.wukongnotnull.service.UserService;
import com.wukongnotnull.utils.ParamsException;
import com.wukongnotnull.vo.HttpResult;
import com.wukongnotnull.vo.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{username}")
    public HttpResult getUserByUsername(@PathVariable String username){

        User userByUsername = this.userService.getUserByUsername(username);

        return HttpResult.success(userByUsername);
    }

    @GetMapping("/users/id/{id}")
    public HttpResult<Object> getUserById(@PathVariable("id") Integer id){
        User user =this.userService.getUserById(id);

        return HttpResult.success(user);
    }

    @PostMapping("/users")
    public HttpResult addUser(@Validated  @RequestBody User user){
        HttpResult httpResult =null;
        try {
            User user1 = this.userService.addUser(user);
             httpResult = HttpResult.success(user1);
        }catch (ParamsException paramsException){
           if(paramsException.getCode() == 520){
               httpResult = HttpResult.failure(ResultCodeEnum.USERNAME_REPEAT);
           }
        }catch (Exception e){
            httpResult = HttpResult.failure(ResultCodeEnum.WUKONG_ERROR);
            e.printStackTrace();
        }

        return httpResult;
    }

    @PutMapping("/users")
    public HttpResult modifyUser(@RequestBody User user){
        HttpResult<User> httpResult =null;
        try {
            User user1 = this.userService.modifyUser(user);
            httpResult = HttpResult.success(user1);
        }catch (ParamsException paramsException){
            if(paramsException.getCode() == 520){
                httpResult = HttpResult.failure(ResultCodeEnum.USERNAME_REPEAT);
            }
        }catch (Exception e){
            httpResult = HttpResult.failure(ResultCodeEnum.WUKONG_ERROR);
            e.printStackTrace();
        }

        return httpResult;

    }

}