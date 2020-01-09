package com.lyh.seata.dubbo.storage;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luo yihang
 * @date 2019/10/14 9:20
 */
@SpringBootApplication(scanBasePackages = "com.lyh", exclude = DruidDataSourceAutoConfigure.class)
@MapperScan(basePackages = "com.lyh.**.dao")
@EnableDubbo
public class StorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
