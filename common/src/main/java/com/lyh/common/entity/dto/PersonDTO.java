package com.lyh.common.entity.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author luo yihang
 * @date 2019/11/21 10:42
 */
@Data
@Builder
public class PersonDTO {

    private Long id;

    private String userName;

}
