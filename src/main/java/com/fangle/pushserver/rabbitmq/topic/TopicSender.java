package com.fangle.pushserver.rabbitmq.topic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void topicSender(String message) {
        String routingKey = "event.parking.xxx";
        log.info(routingKey + " 发送消息：" + message);
        this.rabbitTemplate.convertAndSend(TopicConfig.EXCHANGE_NAME, routingKey, message);
    }

}