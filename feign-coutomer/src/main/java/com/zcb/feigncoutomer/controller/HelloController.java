package com.zcb.feigncoutomer.controller;

import com.zcb.feigncoutomer.service.IHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zcbin
 * @title: HelloController
 * @packageName: com.zcb.feigncoutomer.controller
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/14 22:01
 */
@RestController
public class HelloController {
    @Resource
    private IHelloService helloService;
    @GetMapping(value = "/customer/hello")
    public String hello() {
        return helloService.hello();
    }
}
