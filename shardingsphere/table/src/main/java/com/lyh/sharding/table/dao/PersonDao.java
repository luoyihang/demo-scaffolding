package com.lyh.sharding.table.dao;

import com.lyh.common.entity.PersonModel;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author luo yihang
 * @date 2019/11/5 16:04
 */
public interface PersonDao {

    /**
     * userName 分表
     *
     * @param userName
     * @return
     */
    String getPersonByUserName(@Param("userName") String userName);

    /**
     * userName 和 createTime 分表
     *
     * @param userName
     * @param startTime
     * @param endTime
     * @return
     */
    String personByUserNameAndCreateTime(@Param("userName") String userName, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /**
     * userName 和 createTime 分表
     *
     * @param list
     * @param startTime
     * @param endTime
     * @return
     */
    List<String> listPersonByUserNameAndCreateTime(@Param("list") List<String> list, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /**
     * 新增
     *
     * @param personModel
     */
    void addPerson(@Param("personModel") PersonModel personModel);

    /**
     * 新增
     *
     * @param personList
     */
    void addPersonList(@Param("list") List<PersonModel> personList);
}
