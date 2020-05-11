package com.lyh.dubbo.consumer.controller;

import com.lyh.dubbo.interfaces.PersonDubboService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
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

    @Reference(version = "1.0", timeout = 10000)
    private PersonDubboService personDubboService;

    @PostMapping("/getUserName")
    public String getUserName() {
        String userName = personDubboService.getUserName(123L);
        log.info(userName);
        return userName;
    }
}
