package com.lyh.use;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.lyh.use.entity.PersonConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LYH
 * @date 2020/4/24
 */
@SpringBootApplication(scanBasePackages = "com.lyh", exclude = DruidDataSourceAutoConfigure.class)
@MapperScan(basePackages = "com.lyh.**.dao")
public class CommonUseApplication {

    @Autowired
    private PersonConfig personConfig;

    public static void main(String[] args) {
        SpringApplication.run(CommonUseApplication.class, args);
        System.out.println(1);
    }
}
