package com.zcb.alibabanacosconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zcbin
 * @title: IHelloService
 * @packageName: com.zcb.alibabanacosconsumer.service
 * @projectName: springcloud
 * @description: 测试feign负载均衡
 * @date: 2020/8/12 16:10
 */
@Component
@FeignClient(name = "nacos-provider")
public interface IHelloService {
    /**
     * provider接口
     * @return
     */
    @GetMapping(value = "/nacos/provider/hello")
    String hello();

}
