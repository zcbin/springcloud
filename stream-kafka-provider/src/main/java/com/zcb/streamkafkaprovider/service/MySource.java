package com.zcb.streamkafkaprovider.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author: zcbin
 * @title: IMySource
 * @packageName: com.zcb.streamkafkaprovider.service
 * @projectName: springcloud
 * @description:
 * @date: 2020/8/6 16:54
 */
public interface MySource {
    @Output("myOutput")
    MessageChannel myOutput();
}
