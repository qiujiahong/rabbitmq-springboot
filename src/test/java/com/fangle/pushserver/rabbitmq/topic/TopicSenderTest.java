package com.fangle.pushserver.rabbitmq.topic;

import com.fangle.pushserver.rabbitmq.fanout.FanoutSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicSenderTest {
    @Autowired
    private FanoutSender fanoutSender;
    @Test
    public void Test() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        fanoutSender.send("Time1 => " + sf.format(new Date()));
        fanoutSender.send2("Date2 => " + sf.format(new Date()));
    }
}