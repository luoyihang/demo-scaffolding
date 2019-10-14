package com.lyh.seata.dubbo.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luo yihang
 * @date 2019/10/12 15:39
 */
@RestController
@RequestMapping("/purchase")
public class BusinessController {

    @GetMapping("/purchase")
    public String purchase(@RequestParam Integer num) {
        return "success";
    }
}
