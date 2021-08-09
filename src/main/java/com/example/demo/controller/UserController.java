package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    @PostMapping(value = "/test")
    @ResponseBody
    public String test(String name){
        if (userService.register(name)){
            return "该用户已存在";
        }
        return "该用户验证成功";
    }


    @PostMapping(value = "/login")
    @ResponseBody
    public String login(String username,String password){
        if (userService.findUserByNameAndPassword(username,password)!=null){
            return "登录成功";
        }
        return "用户名密码错误";
    }


    @PostMapping(value = "/register")
    @ResponseBody
    public String register(String uid,String name,String did,String password){
        if (userService.selectByuid(uid)==null){
            userService.insertUser(new User(uid,name,did,password));
            return "该注册成功";
        }
        return "该用户已存在，不能重复注册";
    }




}
