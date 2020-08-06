package com.zcb.streamkafkaconsumer.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author: zcbin
 * @title: ReceiveService
 * @packageName: com.zcb.streamkafkaconsumer.service
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/5 22:57
 */
@EnableBinding(Sink.class)
public class ReceiveService {
    @StreamListener(Sink.INPUT)
    public void receive(Message<String> message) {
        System.out.println("receive : " + message.getPayload());
    }
}
