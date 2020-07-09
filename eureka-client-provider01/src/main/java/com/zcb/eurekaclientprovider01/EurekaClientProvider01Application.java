package com.zcb.eurekaclientprovider01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProvider01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvider01Application.class, args);
    }

}
