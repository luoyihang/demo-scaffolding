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
public class TableController {

    @Resource
    private PersonDao personDao;

    @PostMapping("/personTableByKey")
    public String personTableByKey(@RequestBody ShardingDTO shardingDTO) {
        return personDao.getPersonByUserName(shardingDTO.getUserNameList().get(0));
    }

    @PostMapping("/personByUserNameAndCreateTime")
    public String personByUserNameAndCreateTime(@RequestBody ShardingDTO shardingDTO) {
        return personDao.personByUserNameAndCreateTime(shardingDTO.getUserNameList().get(0), new Date(1572969600000L), new Date());
    }

    @PostMapping("/listPersonByUserNameAndCreateTime")
    public List<String> listPersonByUserNameAndCreateTime(@RequestBody ShardingDTO shardingDTO) {
        return personDao.listPersonByUserNameAndCreateTime(shardingDTO.getUserNameList(), new Date(1572969600000L), new Date());
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
}
