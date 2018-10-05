package com.fangle.pushserver.rabbitmq.topicjson;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer id;
    private String name;
    private Date date;

    public Order(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }
}
