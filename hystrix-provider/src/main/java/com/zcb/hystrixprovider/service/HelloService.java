package com.zcb.hystrixprovider.service;

import cn.hutool.core.util.IdUtil;
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
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "超时";
    }
    public String fallbackTimeOut() {
        return "超时了，请重试";
    }

    //模拟熔断
    @HystrixCommand(fallbackMethod = "fallbackBreaker",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),              //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),    //请求数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //休眠时间窗
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),  //错误率
    })
    public String helloCircuitBreaker(String id) {
        if(Integer.valueOf(id) < 0){
            throw  new RuntimeException("****id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return  Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serialNumber;
    }
    public String fallbackBreaker(String id) {
        return "熔断了" + id;
    }
}
