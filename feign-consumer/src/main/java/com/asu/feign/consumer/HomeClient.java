package com.asu.feign.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-provider")
public interface HomeClient {
    @GetMapping("/")
    String consumer();
}
