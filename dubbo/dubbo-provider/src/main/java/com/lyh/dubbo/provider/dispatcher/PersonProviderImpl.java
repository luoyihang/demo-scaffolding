package com.lyh.dubbo.provider.dispatcher;

import com.lyh.dubbo.interfaces.PersonDubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author luo yihang
 * @date 2019/9/18 19:35
 */
@Component
@Service(version = "1.0", interfaceClass = PersonDubboService.class)
public class PersonProviderImpl implements PersonDubboService {

    @Override
    public String getUserName(Long id) {
        return "当前用户名是" + id;
    }
}