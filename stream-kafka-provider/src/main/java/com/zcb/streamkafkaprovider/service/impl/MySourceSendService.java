package com.zcb.streamkafkaprovider.service.impl;

import cn.hutool.core.lang.UUID;
import com.zcb.streamkafkaprovider.service.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author: zcbin
 * @title: MySourceSendService
 * @packageName: com.zcb.streamkafkaprovider.service.impl
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/6 16:58
 */
@EnableBinding(MySource.class)
public class MySourceSendService {
    @Autowired
    private MySource source;

    public void send() {
        String serial = UUID.randomUUID().toString();
        source.myOutput().send(MessageBuilder.withPayload(serial).build());
        System.out.println("my send msg : " + serial);
    }
}
