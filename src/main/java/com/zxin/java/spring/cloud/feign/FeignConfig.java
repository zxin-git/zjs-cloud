package com.zxin.java.spring.cloud.feign;

/**
 * @author zxin
 */

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients
//@EnableFeignClients(basePackages = {"com.zxin.java.spring.cloud.feign.client"})
@Configuration
public class FeignConfig {

}
