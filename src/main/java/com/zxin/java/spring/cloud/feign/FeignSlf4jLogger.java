package com.zxin.java.spring.cloud.feign;

import feign.Request;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.Map;

/**
 * @author zxin
 */
@Slf4j
public class FeignSlf4jLogger extends feign.Logger {

    @Override
    protected void log(String configKey, String format, Object... args) {

    }

    @Override
    protected void logRequest(String configKey, Level logLevel, Request request) {
        Map<String, Collection<String>> map = request.headers();
        String url = request.url();
        String method = request.httpMethod().name();

//        super.logRequest(configKey, logLevel, request);
        log.info("[{}]", request);
    }
}
