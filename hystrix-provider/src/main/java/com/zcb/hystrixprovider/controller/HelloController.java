package com.zcb.hystrixprovider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zcb.hystrixprovider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcbin
 * @title: HelloController
 * @packageName: com.zcb.hystrixprovider.controller
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/21 21:58
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;


    @GetMapping(value = "/provider/hystrix/hello")
    public String hello(@RequestParam(value = "id") String id) {
        return helloService.hello(id);
    }


    @GetMapping(value = "/provider/hystrix/time_out")
    public String timeOut() {
        return helloService.timeOut();
    }

}
