package com.fangle.pushserver.rabbitmq.topicjson;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory;
import org.springframework.messaging.handler.annotation.support.MessageHandlerMethodFactory;

@Configuration
public class TopicJsonConfig  {

    final static String EXCHANGE_NAME = "pmsEventExchange"; //交换器名称

    //1.
    final static String QUEUE_NAME3 = "event.test";
    @Bean
    public Queue queuetopic3() {
        return new Queue(TopicJsonConfig.QUEUE_NAME3);
    }
    // 配置交换器
    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange(TopicJsonConfig.EXCHANGE_NAME);
    }

    // 绑定队列到交换器，并设置路由键（log.*.error）
    @Bean
    Binding bindingtopicExchangeQueue3(Queue queuetopic3, TopicExchange topicExchange) {
        return BindingBuilder.bind(queuetopic3).to(topicExchange).with("event.*");
    }
}