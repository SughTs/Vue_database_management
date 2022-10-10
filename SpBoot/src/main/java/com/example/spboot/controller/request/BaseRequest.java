package com.example.spboot.controller.request;

import lombok.Data;

@Data
public class BaseRequest
{
    private Integer pageNum = 1;
    private Integer pagesize = 10;
}
