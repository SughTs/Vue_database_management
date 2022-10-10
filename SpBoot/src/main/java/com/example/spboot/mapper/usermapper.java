package com.example.spboot.mapper;

import com.example.spboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//操作数据库的接口
@Mapper
public interface usermapper
{
    //@Select("select * from user")
    List<User> listUsers();//service层进行调用

}
