package com.zcb.eurekaclientcustomer.controller;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: zcbin
 * @title: HelloCustomer
 * @packageName: com.zcb.eurekaclientcustomer.controller
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/1 13:52
 */
@RestController
@RequestMapping(value = "/customer")
public class HelloCustomer {
    private static final String PROVIDER_URL = "http://EUREKA-CLIENT-PROVIDER";
    //private static final String PROVIDER_URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello() {
        System.out.println("customer");
        return restTemplate.getForEntity(PROVIDER_URL + "/provider/hello?id=123", String.class);

    }
}
