package com.lyh.dubbo.provider.dispatcher;

import com.lyh.dubbo.interfaces.PersonDubboApi;
import org.springframework.stereotype.Component;

/**
 * @author luo yihang
 * @date 2019/9/18 19:35
 */
@Component("personProviderImpl")
public class PersonProviderImpl implements PersonDubboApi {

    @Override
    public String getUserName(Long id) {
        return "当前用户名是" + id;
    }
}
