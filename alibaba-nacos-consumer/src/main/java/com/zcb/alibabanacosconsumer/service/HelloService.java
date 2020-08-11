package com.zcb.alibabanacosconsumer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: zcbin
 * @title: Service
 * @packageName: com.zcb.alibabanacosconsumer.service
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/11 23:14
 */
@Service
public class HelloService {
    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    public String hello() {
        return restTemplate.getForObject(serverURL + "/nacos/provider/hello", String.class);

    }

}
