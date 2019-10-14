package com.lyh.common.config.exceptions;

import com.lyh.common.config.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luo yihang
 * @date 2019/10/14 10:27
 */
@Slf4j
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> handlerForException(Exception e) {
        log.error("", e);
        Map<String, Object> result = new HashMap<>(4);
        result.put("code", "500");
        result.put("message", "系统异常");
        return result;
    }

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public Map<String, Object> handlerForBaseException(BaseException e) {
        log.error("", e);
        Map<String, Object> result = new HashMap<>(4);
        result.put("code", e.getType());
        result.put("message", e.getMessage());
        return result;
    }
}
