package com.example.spboot.service.impl;

import com.example.spboot.controller.request.UserPageRequest;
import com.example.spboot.entity.User;
import com.example.spboot.mapper.usermapper;
import com.example.spboot.service.IUserservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userService implements IUserservice //实现类
{
    @Autowired
    usermapper usermapper;

    @Override
    public List<User> list() {
        return usermapper.list();
    }

    @Override
    public Object page(UserPageRequest userPageRequest) {
/*        String name = userPageRequest.getName();
        String phone = userPageRequest.getPhone();*/
       // PageHelper.startPage(userPageRequest.getPageNum(),userPageRequest.getPagesize());
        PageHelper.startPage(userPageRequest.getPageNum(),userPageRequest.getPagesize());
        List<User> users = usermapper.listByCondition(userPageRequest);
        //PageInfo<User>userPageInfo = new PageInfo<>(users);
        return new PageInfo<>(users);
    }
}
