package com.fangle.pushserver.rabbitmq.fanout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RabbitListener(queues = "fanout")
public class FanoutReceiver {
    @RabbitHandler
    public void process(String msg) {
        log.info("Fanout（FanoutReceiver）消费消息：" + msg);
    }
}