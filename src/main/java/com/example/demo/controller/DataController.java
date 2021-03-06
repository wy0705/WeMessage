package com.example.demo.controller;

import com.example.demo.entity.UserData;
import com.example.demo.service.DataserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {
    @Autowired
    private DataserviceImpl dataservice;


    @PostMapping(value = "/addData")
    @ResponseBody
    public String addData(int age,String gender){
        dataservice.insertdata(new UserData(age,gender));
        return "该资料已添加";
    }

    @PostMapping(value = "/selectData")
    @ResponseBody
    public UserData selectData(int did){
            return dataservice.selectBydid(did);
    }

    @PostMapping(value = "/updateData")
    @ResponseBody
    public String updateData(String did,int age,String gender){
        if (dataservice.updatedataz(new UserData(age,gender))){
            return "已更新";
        }
        return "不存在用户无法更新";
    }

}
