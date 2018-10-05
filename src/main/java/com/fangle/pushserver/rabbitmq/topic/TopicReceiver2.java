package com.fangle.pushserver.rabbitmq.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TopicReceiver2 {
    @RabbitHandler
    @RabbitListener(queues = "log.all")
    public void process(String msg) {
        log.info("log.* 消费消息：" + msg);
    }
}