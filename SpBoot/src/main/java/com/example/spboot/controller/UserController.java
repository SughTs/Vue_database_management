package com.example.spboot.controller;

import com.example.spboot.common.Result;
import com.example.spboot.controller.request.UserPageRequest;
import com.example.spboot.entity.User;
import com.example.spboot.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//@CrossOrigin//解决跨域错误

//标识风格的作用

//添加前缀
@Service
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController
{
    @Autowired
    IUserservice userService;

    @GetMapping("/list")
    public Result list()
    {
        List<User> users = userService.list();
        return Result.success(users);
    }
    @GetMapping("/page")
    public Result page(UserPageRequest userPageRequest)
    {
        return Result.success(userService.page(userPageRequest));
    }
}
