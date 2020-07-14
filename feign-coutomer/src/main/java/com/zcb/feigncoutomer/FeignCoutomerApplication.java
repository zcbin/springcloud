package com.zcb.feigncoutomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignCoutomerApplication {
    //eureka-client + feign
    public static void main(String[] args) {
        SpringApplication.run(FeignCoutomerApplication.class, args);
    }

}
