package com.zcb.hystrixcustomer.controller;

import com.zcb.hystrixcustomer.service.CustomerHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcbin
 * @title: HelloController
 * @packageName: com.zcb.hystrixcustomer.controller
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/22 21:37
 */
@RestController
public class HelloController {
    @Autowired
    private CustomerHelloService customerHelloService;

    @GetMapping(value = "/customer/hystrix/hello")
    public String hello(@RequestParam(value = "id") String id) {
        System.out.println("--" + id);
        return customerHelloService.hello();
    }

    @GetMapping(value = "/customer/hystrix/time_out")
    public String timeOut() {
        return customerHelloService.timeOut();
    }
}
