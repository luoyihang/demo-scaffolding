package com.lyh.seata.dubbo.business.controller;

import com.lyh.seata.dubbo.api.exception.DubboException;
import com.lyh.seata.dubbo.business.service.BusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luo yihang
 * @date 2019/10/12 15:39
 */
@Slf4j
@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/purchase")
    public String purchase(@RequestParam Integer storageNum) throws DubboException {
        log.info("purchase param [{}]", storageNum);
        businessService.doPurchase(storageNum);
        return "success";
    }
}
