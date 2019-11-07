package com.lyh.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author luo yihang
 * @date 2019/11/6 17:25
 */
@Data
public class PersonModel {

    private Long id;

    @JsonFormat( pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date createTime;

    private String userName;

    private Integer age;

    private String personName;
}
