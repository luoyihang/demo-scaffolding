package com.lyh.seata.dubbo.business;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luo yihang
 * @date 2019/10/12 14:06
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lyh.**.dao")
@EnableDubbo
public class SeataDubboBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataDubboBusinessApplication.class, args);
    }
}
