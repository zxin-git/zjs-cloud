package com.zxin.java.spring.cloud.feign.api;

import com.zxin.java.core.Result;
import com.zxin.java.spring.cloud.feign.CcbFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @author zxin
 */
@FeignClient(name = "icbc", contextId = "icbc-pay", url = "${feign.client.url.icbc:http://icbc}", path = "/pay")
public interface IcbcPayFeignApi {

    /**
     * 交易接口
     * @return  响应XML
     */
    @PostMapping("/interlink")
    Result<String> interlink(@RequestBody @Valid String xml);

}
