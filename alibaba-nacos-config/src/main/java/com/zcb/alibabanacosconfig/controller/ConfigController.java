package com.zcb.alibabanacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcbin
 * @title: controller
 * @packageName: com.zcb.alibabanacosconfig
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/12 17:33
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    private String info;

    @GetMapping(value = "/nacos/config/info")
    public String info() {
        return this.info;
    }
}
