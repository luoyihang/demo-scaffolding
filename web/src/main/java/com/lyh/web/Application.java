package com.lyh.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luo yihang
 * @date 2019/9/18 12:30
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lyh.*.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

