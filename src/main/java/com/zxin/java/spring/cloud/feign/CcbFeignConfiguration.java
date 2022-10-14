package com.zxin.java.spring.cloud.feign;

import feign.codec.Decoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

/**
 * @author zxin
 */
public class CcbFeignConfiguration {

    @Bean
    public AuthRequestInterceptor authRequestInterceptor(){
        return new AuthRequestInterceptor();
    }

    @Bean
    public SignVerifyDecoder signDecoder(@Autowired @Qualifier("feignDecoder") Decoder decoder){
        return new SignVerifyDecoder(decoder);
    }

}
