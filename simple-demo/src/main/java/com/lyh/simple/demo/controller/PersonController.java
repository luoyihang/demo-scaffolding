package com.lyh.simple.demo.controller;

import com.lyh.common.entity.PersonModel;
import com.lyh.common.entity.dto.PersonDTO;
import com.lyh.simple.demo.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author luo yihang
 * @date 2019/11/21 10:15
 */
@RestController
public class PersonController {

    @Resource
    private PersonDao personDao;
    @Autowired
    private DataSource dataSource;

    @PostMapping("/test")
    public PersonModel test(@RequestBody PersonDTO personDTO) {
        return personDao.getPersonInfo(personDTO.getId());
    }
}
