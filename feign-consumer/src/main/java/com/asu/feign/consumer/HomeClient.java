package com.asu.feign.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*
        描述: 指定这个接口所要调用的 提供者服务名称 "eureka-provider"
**/
@FeignClient(value = "eureka-provider", fallbackFactory = HystrixClientFallbackFactory.class)
public interface HomeClient {
    @GetMapping("/")
    String consumer();
}
