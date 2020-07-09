package com.zcb.consulprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcbin
 * @title: Hello
 * @packageName: com.zcb.eurekaclientprovider01.controller
 * @projectName: springcloud
 * @description:
 * @date: 2020/7/2 16:55
 */
@RestController
@RequestMapping(value = "/provider")
public class Hello {
    @Value("${server.port}")
    private String port;
    
    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "id", required = false) String id) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello:").append(port).append(":").append(id);
        return sb.toString();
    }
}
