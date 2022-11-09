package com.zxin.java.spring.cloud.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxin
 */
@RestController
public class CCBNativeFeignClientImpl implements CCBNativeFeignClient {

    @Autowired
    private CCBNativeFeignClient feignClient;

    @Override
    public byte[] keyTransfer(String channelCustomerNo, String type) {
        return feignClient.keyTransfer(channelCustomerNo, type);
    }

}
