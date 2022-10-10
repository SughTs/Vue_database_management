package com.example.spboot.common;

import lombok.Data;

@Data
public class Result
{
    private static final String SUCCESS_CODE = "200";
    private static final String UN_SUCCESS_CODE = "-1";



    private String code;
    private Object data;
    private String msg;

    public static Result success()
    {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);//默认成功属性代码为200
        return result;
    }

    public static Result success(Object data)
    {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);//默认成功属性代码为200
        result.setData(data);
        return result;
    }//多态

    public static Result error(String msg)
    {
        Result result = new Result();
        result.setCode(UN_SUCCESS_CODE);//默认非成功属性代码为-1
        result.setMsg(msg);
        return result;
    }//多态
}
