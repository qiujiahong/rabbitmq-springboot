package com.fangle.pushserver.rabbitmq.fanout;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class FanoutSenderTest {

    @Autowired
    private FanoutSender sender;

    @Test
    public void send() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        sender.send("Time1 => " + sf.format(new Date()));
        sender.send2("Date2 => " + sf.format(new Date()));
    }
}