package com.lyh.sharding.table.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author luo yihang
 * @date 2019/11/7 13:56
 */
@Data
public class ShardingDTO {

    private List<String> userNameList;

    @JsonFormat( pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date startTime;

    @JsonFormat( pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date endTime;
}
