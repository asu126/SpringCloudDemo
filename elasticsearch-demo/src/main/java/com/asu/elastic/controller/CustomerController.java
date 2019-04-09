package com.asu.elastic.controller;

import com.asu.elastic.service.CustomersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/user")
@ResponseBody
public class CustomerController {

    @Autowired
    private CustomersService cService;

    @RequestMapping("/{id}")
    Optional showUserForm(@PathVariable("id") String userId) {

        System.out.println("user id" + userId);
        java.util.Optional c1 = cService.findById(userId);
        System.out.println(c1);
        return c1;
    }
}
