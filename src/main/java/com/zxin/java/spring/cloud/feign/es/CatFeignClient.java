package com.zxin.java.spring.cloud.feign.es;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "es", url = "http://localhost:9200", path = "_cat")
public interface CatFeignClient {


    @GetMapping("aliases")
    void aliases();


}
