package com.zcb.consulcustomer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: zcbin
 * @title: HelloCustomer
 * @packageName:
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/1 13:52
 */
@RestController
@RequestMapping(value = "/customer")
public class HelloCustomer {
    private static final String PROVIDER_URL = "http://consul-provider";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        System.out.println("customer");
        return restTemplate.getForObject(PROVIDER_URL + "/provider/hello?id=123", String.class);

    }
}
