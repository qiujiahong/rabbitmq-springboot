package com.fangle.pushserver.rabbitmq.fanout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RabbitListener(queues = "fanout2")
public class FanoutReceiver2 {
    @RabbitHandler
    public void process(String message) {
        log.info("Fanout（FanoutReceiver2）消费消息：" + message);
    }
}