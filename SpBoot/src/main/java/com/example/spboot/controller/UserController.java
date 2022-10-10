package com.example.spboot.controller;

import com.example.spboot.entity.User;
import com.example.spboot.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//@CrossOrigin//解决跨域错误
@RestController
//标识风格的作用
@RequestMapping("/user")
//添加前缀
@Service
public class UserController
{
    @Autowired
    IUserservice userservice;

    @GetMapping("/list")
    public List<User> listUsers()
    {
        return userservice.listUsers();
    }
}
