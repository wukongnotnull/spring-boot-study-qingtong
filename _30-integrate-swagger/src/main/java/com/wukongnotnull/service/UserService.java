package com.wukongnotnull.service;

import com.github.pagehelper.PageInfo;
import com.wukongnotnull.bo.UserParams;
import com.wukongnotnull.domain.User;

public interface UserService {

    User getUserByUsername(String username);

    User getUserById(Integer id);

    User  addUser(User user);

    User modifyUser(User user);

    void deleteUser(Integer id);

    PageInfo<User> getUserPageList(UserParams userParams);
}