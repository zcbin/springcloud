package com.zcb.feigncoutomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zcbin
 * @title: IHelloService
 * @packageName: com.zcb.feigncoutomer.service
 * @projectName: springcloud
 * @description: feign interface
 * @date: 2020/7/14 21:59
 */
@Component
@FeignClient(value = "EUREKA-CLIENT-PROVIDER")
public interface IHelloService {
    @GetMapping(value = "provider/hello?id=122")
    String hello();
}
