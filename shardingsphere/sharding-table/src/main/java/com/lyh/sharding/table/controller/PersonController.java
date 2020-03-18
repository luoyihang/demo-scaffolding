package com.lyh.sharding.table.controller;

import com.lyh.common.entity.PersonModel;
import com.lyh.sharding.table.dao.PersonDao;
import com.lyh.sharding.table.entity.ShardingDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author luo yihang
 * @date 2019/11/5 16:02
 */
@RestController
@RequestMapping("/sharding")
public class PersonController {

    @Resource
    private PersonDao personDao;

    @PostMapping("/getPersonByUserName")
    public String getPersonByUserName(@RequestBody ShardingDTO shardingDTO) {
        return personDao.getPersonByUserName(shardingDTO.getUserNameList().get(0));
    }

    @PostMapping("/getPersonByUserName2")
    public String getPersonByUserName2(@RequestBody ShardingDTO shardingDTO) {
        return personDao.getPersonByUserName2(shardingDTO.getUserNameList().get(0));
    }

    @PostMapping("/listPersonByUserName")
    public List<String> listPersonByUserName(@RequestBody ShardingDTO shardingDTO) {
        return personDao.listPersonByUserName(shardingDTO.getUserNameList());
    }

    @PostMapping("/getPersonRangeByUserNameCreateTime")
    public String getPersonRangeByUserNameCreateTime(@RequestBody ShardingDTO shardingDTO) {
        return personDao.getPersonRangeByUserNameCreateTime(shardingDTO.getUserNameList().get(0), new Date(1572969600000L), new Date());
    }

    @PostMapping("/listPersonByUserNameAndCreateTime")
    public List<String> listPersonRangeByUserNameCreateTime(@RequestBody ShardingDTO shardingDTO) {
        return personDao.listPersonRangeByUserNameCreateTime(shardingDTO.getUserNameList(), new Date(1572969600000L), new Date());
    }

    @PostMapping("/addPerson")
    public String addPerson(@RequestBody PersonModel personModel) {
        personDao.addPerson(personModel);
        return "success";
    }

    @PostMapping("/addPersonList")
    public String addPersonList(@RequestBody List<PersonModel> personList) {
        personDao.addPersonList(personList);
        return "success";
    }

    @PostMapping("/addPersonRange")
    public String addPersonRange(@RequestBody PersonModel personModel) {
        personDao.addPersonRange(personModel);
        return "success";
    }

    @PostMapping("/addPersonRangeList")
    public String addPersonRangeList(@RequestBody List<PersonModel> personModelList) {
        // 4.0.0-RC3不支持
        personDao.addPersonRangeList(personModelList);
        return "success";
    }
}
