package com.fangle.pushserver.rabbitmq.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TopicReceiver3 {
    @RabbitHandler
    @RabbitListener(queues = "log.all.error")
    public void process(String msg) {
        log.info("log.*.error 消费消息：" + msg);
    }
}