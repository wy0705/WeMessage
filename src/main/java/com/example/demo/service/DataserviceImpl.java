package com.example.demo.service;

import com.example.demo.dao.DataDao;
import com.example.demo.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataserviceImpl implements DataService {
    @Autowired
    private DataDao dataDao;

    @Override
    public int deletedata(int did) {
        return dataDao.deleteData(did);
    }

    @Override
    public int insertdata(UserData data) {
        return dataDao.insertData(data);
    }

    @Override
    public UserData selectBydid(int did) {
        return dataDao.selectBydid(did);
    }

    @Override
    public boolean updatedataz(UserData data) {
        if (dataDao.Update(data)!=0){
            return true;
        }
        return false;
    }
}
