package com.zcb.hystrixcustomer.service;

import org.springframework.stereotype.Component;

/**
 * @author: zcbin
 * @title: HelloServiceFallback
 * @packageName: com.zcb.hystrixcustomer.service
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/22 21:59
 */
@Component
public class HelloServiceFallback implements CustomerHelloService {

    @Override
    public String hello() {
        return "出错了，降级";
    }

    @Override
    public String timeOut() {
        return "超时了，降级";
    }
}
