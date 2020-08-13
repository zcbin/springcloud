package com.zcb.alibabanacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosConfigApplication.class, args);
    }

}
