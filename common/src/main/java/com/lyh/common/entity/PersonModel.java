package com.lyh.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luo yihang
 * @date 2019/11/6 17:25
 */
@Data
public class PersonModel implements Serializable {

    private static final long serialVersionUID = -8090602806322758551L;

    private Long id;

    @JsonFormat( pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date createTime;

    private String userName;

    private Integer age;

    private String personName;
}
