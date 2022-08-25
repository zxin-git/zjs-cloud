package com.zxin.java.spring.cloud.feign.api;

import com.zxin.java.core.Result;
import com.zxin.java.spring.cloud.feign.AbstractCloudApplicationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class CcbPayFeignApiTest extends AbstractCloudApplicationTest {

    @Autowired
    private CcbPayFeignApi ccbPayFeignApi;

    @Autowired
    private IcbcPayFeignApi icbcPayFeignApi;

    @Test
    void interlink() {
        Result<String> result = icbcPayFeignApi.interlink("xml");
        System.out.println(result);
    }
}