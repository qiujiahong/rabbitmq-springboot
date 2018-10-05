package com.fangle.pushserver.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

//@Component
//@RabbitListener(queues = "eventQueue")
public class TopicReceiver {

//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//    @RabbitHandler
//
//    public void receiveMessage(String message) {
//        System.out.println("Received <" + message + ">");
//    }
}
