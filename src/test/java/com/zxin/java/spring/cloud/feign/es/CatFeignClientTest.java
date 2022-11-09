package com.zxin.java.spring.cloud.feign.es;

import com.zxin.java.spring.cloud.feign.AbstractCloudApplicationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CatFeignClientTest extends AbstractCloudApplicationTest {

    @Autowired
    CatFeignClient catFeignClient;

    @Test
    void aliases() {
        catFeignClient.aliases();
    }
}