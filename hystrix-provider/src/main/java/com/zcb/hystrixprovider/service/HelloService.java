package com.zcb.hystrixprovider.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @author: zcbin
 * @title: HelloService
 * @packageName: com.zcb.hystrixprovider.service
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/21 21:53
 */
@Service
public class HelloService {

    public String hello(String id) {
        return "hello" + id;
    }

    /**
     * 模拟超时，服务降级
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallbackTimeOut", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "500")
    })
    public String timeOut() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "超时";
    }
    public String fallbackTimeOut() {
        return "超时了，请重试";
    }

}
