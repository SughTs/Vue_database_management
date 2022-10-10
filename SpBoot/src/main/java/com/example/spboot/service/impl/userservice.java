package com.example.spboot.service.impl;

import com.example.spboot.entity.User;
import com.example.spboot.mapper.usermapper;
import com.example.spboot.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userservice implements IUserservice //实现类
{
    @Autowired
    usermapper usermapper;

    @Override
    public List<User> listUsers() {
        return usermapper.listUsers();
    }
}
