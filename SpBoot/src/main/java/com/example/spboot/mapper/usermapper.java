package com.example.spboot.mapper;

import com.example.spboot.controller.request.UserPageRequest;
import com.example.spboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//操作数据库的接口
@Mapper
public interface usermapper
{
    //@Select("select * from user")
    List<User> list();//service层进行调用

    List<User> listByCondition(UserPageRequest userPageRequest);

}
