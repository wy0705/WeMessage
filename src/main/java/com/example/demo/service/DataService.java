package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.entity.UserData;

public interface DataService {
    int deletedata(int did);
    int insertdata(UserData data);
    UserData selectBydid(int did);
    boolean updatedataz(UserData data);
}
