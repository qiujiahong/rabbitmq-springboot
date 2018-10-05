package com.fangle.pushserver.rabbitmq.topicjson;

import com.fangle.pushserver.rabbitmq.topic.TopicConfig;
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
public class TopicJsonSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    public void sendOrder(Order order) {
        try {
            String orderJson = objectMapper.writeValueAsString(order);
            log.info("[send json] {}",orderJson);
            Message message = MessageBuilder
                    .withBody(orderJson.getBytes())
                    .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                    .build();
            this.rabbitTemplate.convertAndSend("event.test", message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


}