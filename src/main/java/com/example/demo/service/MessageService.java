package com.example.demo.service;

import com.example.demo.entity.Message;

import java.util.List;

public interface MessageService {
    int deleteMessage(int mid);
    int insertMessage(Message message);
    List<Integer> selectMessageByfid(int fid);

}
