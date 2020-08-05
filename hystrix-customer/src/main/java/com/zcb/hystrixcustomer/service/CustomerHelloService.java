package com.zcb.hystrixcustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: zcbin
 * @title: IHelloService
 * @packageName: com.zcb.hystrixcustomer.service
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/22 21:31
 */
@Component
@FeignClient(value = "HYSTRIX-PROVIDER", fallback = HelloServiceFallback.class)
public interface CustomerHelloService {
    @GetMapping(value = "/provider/hystrix/hello?id=123")
    String hello();

    @GetMapping(value = "/provider/hystrix/time_out")
    String timeOut();
}
