package com.zcb.alibabanacosprovider.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author: zcbin
 * @title: HelloService
 * @packageName: com.zcb.alibabanacosprovider.service
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/11 22:32
 */
@Service
public class HelloService {
    @Value("${server.port}")
    private String port;
    public String hello() {
        System.out.println("hello-" + port);
        return this.port;
    }

}
