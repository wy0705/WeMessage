package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    int deleteUser(int uid);
    int insertUser(User user);
    User selectByuid(int uid);
    User findUserByNameAndPassword(String username,String userid);
    boolean register(String name);
}
