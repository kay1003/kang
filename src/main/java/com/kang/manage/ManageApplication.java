package com.kang.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @company: manage
 * @description: 管理后台启动类
 * @author:
 * @create:
 **/
@RestController
@SpringBootApplication
@MapperScan(value = {"com.kang.manage.domain", "com.kang.manage.mapper"})
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }

    @GetMapping("/who")
    public String who(){
        return "manage-server";
    }
}
