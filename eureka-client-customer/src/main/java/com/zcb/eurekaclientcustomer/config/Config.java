package com.zcb.eurekaclientcustomer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zcbin
 * @title: Config
 * @packageName: com.zcb.eurekaclientcustomer.config
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/1 14:09
 */
@Configuration
public class Config {
    @Bean
    //负载均衡
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
