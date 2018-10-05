package com.fangle.pushserver.rabbitmq.topicjson;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TopicJsonReceiver {

    @RabbitListener(queues = "event.test")
    public void process(Message message) {
        log.info("[rev json] {}" , new String(message.getBody()));
    }

}