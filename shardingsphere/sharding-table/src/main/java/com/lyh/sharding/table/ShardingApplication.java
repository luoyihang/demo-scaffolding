package com.lyh.sharding.table;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luo yihang
 * @date 2019/11/5 15:51
 */
@SpringBootApplication(scanBasePackages = "com.lyh", exclude = {DruidDataSourceAutoConfigure.class})
@MapperScan(basePackages = "com.lyh.**.dao")
public class ShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingApplication.class, args);
    }
}
