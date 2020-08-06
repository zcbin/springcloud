package com.zcb.streamkafkaprovider.controller;

import com.zcb.streamkafkaprovider.service.ISendService;
import com.zcb.streamkafkaprovider.service.impl.MySourceSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcbin
 * @title: SendController
 * @packageName: com.zcb.streamkafkaprovider.controller
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/5 22:27
 */
@RestController
public class SendController {
    @Autowired
    private ISendService sendService;


    @GetMapping("/send")
    public void send() {
        sendService.sendMsg();
    }
}
