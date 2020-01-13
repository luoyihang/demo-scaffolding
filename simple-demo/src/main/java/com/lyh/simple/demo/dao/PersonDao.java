package com.lyh.simple.demo.dao;

import com.lyh.common.entity.PersonModel;
import org.apache.ibatis.annotations.Param;

/**
 * @author luo yihang
 * @date 2019/11/21 10:39
 */
public interface PersonDao {

    /**
     *  获取 person 信息
     *
     * @param id
     * @return
     */
    PersonModel getPersonInfo(@Param("id") Long id);

    /**
     * 新增 person
     *
     * @param personModel
     */
    void addPersonInfo(@Param("param") PersonModel personModel);
}
