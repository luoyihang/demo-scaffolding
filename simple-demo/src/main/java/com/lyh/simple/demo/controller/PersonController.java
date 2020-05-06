package com.lyh.simple.demo.controller;

import com.lyh.common.entity.PersonModel;
import com.lyh.common.entity.dto.PersonDTO;
import com.lyh.simple.demo.dao.PersonDao;
import com.lyh.simple.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author luo yihang
 * @date 2019/11/21 10:15
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;
    @Resource
    private PersonDao personDao;

    @PostMapping("/test")
    public PersonModel test(@RequestBody PersonDTO personDTO) {
        return personDao.getPersonInfo(personDTO.getId());
    }

    @PostMapping("/test2")
    public String test2(@RequestBody PersonDTO personDTO) {
        personService.updatePersonAge(personDTO.getId());
        return "success";
    }
}
