package com.lyh.simple.demo.service;

import com.lyh.common.entity.PersonModel;
import com.lyh.simple.demo.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luo yihang
 * @date 2020/5/6 10:59
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void addPerson(PersonModel personModel) {
        personDao.addPersonInfo(personModel);
    }

    @Override
    public void updatePersonAge(Long id) {
        personDao.updatePersonAge(id);
    }
}
