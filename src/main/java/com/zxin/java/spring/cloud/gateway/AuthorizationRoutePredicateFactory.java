package com.zxin.java.spring.cloud.gateway;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.util.function.Predicate;

/**
 * @author zxin
 */
public class AuthorizationRoutePredicateFactory extends AbstractRoutePredicateFactory<AuthorizationRoutePredicateFactory.Config> {

    public AuthorizationRoutePredicateFactory(Class<Config> configClass) {
        super(configClass);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return null;
    }


//    protected boolean matches()


    @Validated
    public static class Config {

        public static final String SIGNATURE = "signature";

        private String secretKey;

    }

}
