package com.zcb.alibabanacosconsumer.controller;

import com.zcb.alibabanacosconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcbin
 * @title: HelloController
 * @packageName: com.zcb.alibabanacosconsumer.controller
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/11 23:17
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping(value = "/nacos/consumer/hello")
    public String hello() {
        return helloService.hello();
    }
}
