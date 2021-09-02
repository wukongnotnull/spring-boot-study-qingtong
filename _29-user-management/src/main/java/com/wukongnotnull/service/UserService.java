package com.wukongnotnull.service;

import com.wukongnotnull.domain.User;

public interface UserService {

    public User getUserByUsername(String username);

    User getUserById(Integer id);

    public  User  addUser(User user);

    User modifyUser(User user);
}