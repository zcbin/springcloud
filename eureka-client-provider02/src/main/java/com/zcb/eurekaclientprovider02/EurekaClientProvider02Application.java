package com.zcb.eurekaclientprovider02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvider02Application.class, args);
    }

}
