package com.example.spboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class SpBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpBootApplication.class, args);
    }

    @GetMapping
    public String health()
    {
        return "成功使用后端接口";//测试接口 检查接口
    }

}
