package com.lyh.simple.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luo yihang
 * @date 2019/11/21 10:11
 */
@SpringBootApplication(scanBasePackages = "com.lyh")
@MapperScan(basePackages = "com.lyh.**.dao")
public class SimpleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleDemoApplication.class, args);
    }
}
