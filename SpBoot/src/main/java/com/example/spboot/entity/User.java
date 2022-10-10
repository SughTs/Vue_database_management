package com.example.spboot.entity;

import lombok.Data;

@Data//编译之后自动生成模板代码，显得比较简洁
public class User
{
    private Integer id;
    private String name;
    private String username;
    private Integer age;
    private String address;
    private String sex;
    private String phone;

}
