package com.zxin.java.spring.cloud.feign.api;

import com.zxin.java.core.Result;
import com.zxin.java.spring.cloud.feign.AbstractCloudApplicationTest;
import feign.Request;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;


class CcbPayFeignApiTest extends AbstractCloudApplicationTest {

    @Autowired
    private CcbPayFeignApi ccbPayFeignApi;

    @Autowired
    private IcbcPayFeignApi icbcPayFeignApi;

    @Test
    void interlink() {
        Request.Options options = new Request.Options(1, TimeUnit.SECONDS, 5, TimeUnit.SECONDS, true);
        Result<String> result = icbcPayFeignApi.interlink1("xml", options);
        System.out.println(result);
    }
}