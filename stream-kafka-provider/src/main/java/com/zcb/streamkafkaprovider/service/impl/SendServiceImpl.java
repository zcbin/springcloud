package com.zcb.streamkafkaprovider.service.impl;

import cn.hutool.core.lang.UUID;
import com.zcb.streamkafkaprovider.service.ISendService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @author: zcbin
 * @title: SendServiceImpl
 * @packageName: com.zcb.streamkafkaprovider.service.impl
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/5 22:21
 */
@EnableBinding(Source.class)
public class SendServiceImpl implements ISendService {
    @Resource
    private Source source;
    @Override
    public void sendMsg() {
        String serial = UUID.randomUUID().toString();
        source.output().send(MessageBuilder.withPayload(serial).build());
        System.out.println("send msg : " + serial);
    }
}
