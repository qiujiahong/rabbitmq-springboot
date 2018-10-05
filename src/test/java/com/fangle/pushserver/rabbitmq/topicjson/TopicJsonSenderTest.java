package com.fangle.pushserver.rabbitmq.topicjson;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicJsonSenderTest {

    @Autowired
    TopicJsonSender topicJsonSender;

    @Test
    public void sendOrder() {
        Order order = new Order(1,"hello", Calendar.getInstance().getTime());
        topicJsonSender.sendOrder(order);

    }
}