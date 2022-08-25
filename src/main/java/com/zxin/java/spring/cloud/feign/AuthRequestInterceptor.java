package com.zxin.java.spring.cloud.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

/**
 * @author zxin
 */
public class AuthRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("app-token", "$2a$10$5CFOYpR8igyeVBrYsCFPae2f0L8ELzhc/8lL8YrRlUR3wPLDD5pt2");
    }

}
