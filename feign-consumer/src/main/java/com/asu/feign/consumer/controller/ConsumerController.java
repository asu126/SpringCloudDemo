package com.asu.feign.consumer.controller;

import com.asu.feign.consumer.HomeClient;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
public class ConsumerController {
    @Autowired
    private HomeClient homeClient;

    @GetMapping(value = "/hello")
    public String hello() {
        return homeClient.consumer();
    }

    @GetMapping(value = "/hello123")
    public String hello123() {
        return homeClient.consumer();
    }
}