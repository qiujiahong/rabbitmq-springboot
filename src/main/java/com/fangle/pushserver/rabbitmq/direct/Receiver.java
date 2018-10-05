package com.fangle.pushserver.rabbitmq.direct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RabbitListener(queues = "direct")
public class Receiver {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @RabbitHandler
    /**
     * 监听消费消息
     */
    public void process(String message) {
        log.info("[Direct] 消费消息：{}" ,message);
        System.out.println();
    }
}