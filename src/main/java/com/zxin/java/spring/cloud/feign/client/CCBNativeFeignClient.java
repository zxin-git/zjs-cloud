package com.zxin.java.spring.cloud.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hermes", url = "http://hermes")
public interface CCBNativeFeignClient {

    /**
     * @return
     */
    @PostMapping(value = "/interlink/KeyTransfer", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    byte[] keyTransfer(@RequestParam("chanl_cust_no") String channelCustomerNo, @RequestParam("type") String type);

}