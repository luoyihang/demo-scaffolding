package com.lyh.dubbo.interfaces;

/**
 * @author luo yihang
 * @date 2019/9/18 19:36
 */
public interface PersonDubboService {
    /**
     * 查询名称
     *
     * @param id
     * @return
     */
    String getUserName(Long id);
}
