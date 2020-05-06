package com.lyh.simple.demo.service;

import com.lyh.common.entity.PersonModel;

/**
 * @author luo yihang
 * @date 2020/5/6 10:58
 */
public interface PersonService {
    /**
     * 新增
     *
     * @param personModel
     */
    void addPerson(PersonModel personModel);

    /**
     * 增加age
     *
     * @param id
     */
    void updatePersonAge(Long id);
}
