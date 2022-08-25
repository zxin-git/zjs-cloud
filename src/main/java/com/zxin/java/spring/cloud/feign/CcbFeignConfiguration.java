package com.zxin.java.spring.cloud.feign;

import org.springframework.context.annotation.Bean;

/**
 * @author zxin
 */
public class CcbFeignConfiguration {

    @Bean
    public AuthRequestInterceptor authRequestInterceptor(){
        return new AuthRequestInterceptor();
    }

}
