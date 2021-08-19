package com.example.demo.service;

import com.example.demo.entity.UidAndware;

import java.util.List;

public interface UidAndwareService {
    int insertuidAndware(UidAndware uaw);
    public int deleteuidAndware(int uwid);
    public List<Integer> selelctuidAndware(int uid);
}

