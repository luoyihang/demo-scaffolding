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
     * userName 分表2
     *
     * @param userName
     * @return
     */
    String getPersonByUserName2(@Param("userName") String userName);

    /**
     * 批量查询
     *
     * @param userNameList
     * @return
     */
    List<String> listPersonByUserName(@Param("userNameList") List<String> userNameList);


    /**
     * userName 和 createTime 分表
     *
     * @param userName
     * @param startTime
     * @param endTime
     * @return
     */
    String getPersonRangeByUserNameCreateTime(@Param("userName") String userName, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    /**
     * userName 和 createTime 分表
     *
     * @param list
     * @param startTime
     * @param endTime
     * @return
     */
    List<String> listPersonRangeByUserNameCreateTime(@Param("list") List<String> list, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

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

    /**
     * 新增
     *
     * @param personModel
     */
    void addPersonRange(PersonModel personModel);

    /**
     * 批量增加
     *
     * @param personModelList
     */
    void addPersonRangeList(@Param("list") List<PersonModel> personModelList);

}
