package com.example.spboot.service;

import com.example.spboot.controller.request.UserPageRequest;
import com.example.spboot.entity.User;

import java.util.List;

public interface IUserservice {

    List<User> list();//service层进行调用

    Object page(UserPageRequest userPageRequest);
}
