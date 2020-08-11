package com.zcb.alibabanacosprovider2.controller;

import com.zcb.alibabanacosprovider2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcbin
 * @title: HelloController
 * @packageName: com.zcb.alibabanacosprovider.controller
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/11 22:32
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/nacos/provider/hello")
    public String hello() {
        return helloService.hello();
    }
}
