package com.lyh.seata.dubbo.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luo yihang
 * @date 2019/10/14 11:14
 */
@SpringBootApplication(scanBasePackages = "com.lyh")
@MapperScan(basePackages = "com.lyh.**.dao")
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
