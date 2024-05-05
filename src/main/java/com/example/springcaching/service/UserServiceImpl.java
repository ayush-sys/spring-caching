package com.example.springcaching.service;

import com.example.springcaching.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserDao user = new UserDao();

    @Override
    public String getDataOfUser(){
        user.setUuid(1101);
        user.setName("Ayush");
        user.setAge(11);
        return user.toString();
    }
}
