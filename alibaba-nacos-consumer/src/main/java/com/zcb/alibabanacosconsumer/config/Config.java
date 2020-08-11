package com.zcb.alibabanacosconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zcbin
 * @title: Config
 * @packageName: com.zcb.alibabanacosconsumer.config
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/11 23:12
 */
@Configuration
public class Config {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
