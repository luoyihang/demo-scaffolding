package com.lyh.dubbo.consumer.controller;

import com.lyh.dubbo.interfaces.PersonDubboApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luo yihang
 * @date 2019/9/18 19:42
 */
@Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonDubboApi personDubboApi;

    @PostMapping("/getUserName")
    public String getUserName() {
        String userName = personDubboApi.getUserName(123L);
        log.info(userName);
        return userName;
    }
}
