package com.lyh.use.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author LYH
 * @date 2020/4/24
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "person")
public class PersonConfig {
    private String name;
    private Integer age;
    private String sex;
}
