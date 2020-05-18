package com.lyh.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author luo yihang
 * @date 2019/9/19 8:56
 */
@SpringBootApplication(scanBasePackages = "com.lyh")
@ImportResource(locations = {"classpath:application-dubbo.xml"})
@MapperScan(basePackages = "com.lyh.**.dao")
@EnableDubbo
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
