package org.example.rabbitmq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
public class RabbitConfig {

    public static final String BUSINESS_EXCHANGE_NAME = "business-exchange";
    public static final String DEAD_LETTER_EXCHANGE_NAME = "dead-letter-exchange";
    public static final String BUSINESS_QUEUE_NAME = "business-queue";
    public static final String DEAD_LETTER_QUEUE_NAME = "dead-letter-queue";
    public static final String ROUTING_KEY = "routing-key";

    // 声明业务交换机
    @Bean
    public DirectExchange businessExchange() {
        return new DirectExchange(BUSINESS_EXCHANGE_NAME);
    }

    // 声明死信交换机
    @Bean
    public DirectExchange deadLetterExchange() {
        return new DirectExchange(DEAD_LETTER_EXCHANGE_NAME);
    }

    // 声明业务队列
    @Bean
    public Queue businessQueue() {
        Map<String, Object> args = new HashMap<>(2);
        // 设置业务队列的死信交换机
        args.put("x-dead-letter-exchange", DEAD_LETTER_EXCHANGE_NAME);
        return QueueBuilder.durable(BUSINESS_QUEUE_NAME).withArguments(args).build();
    }

    // 声明死信队列
    @Bean
    public Queue deadLetterQueue() {
        return new Queue(DEAD_LETTER_QUEUE_NAME);
    }

    // 将业务队列绑定到业务交换机
    @Bean
    public Binding bindBusinessQueue() {
        return BindingBuilder.bind(businessQueue()).to(businessExchange()).with(ROUTING_KEY);
    }

    // 将死信队列绑定到死信交换机
    @Bean
    public Binding bindDeadLetterQueue() {
        return BindingBuilder.bind(deadLetterQueue()).to(deadLetterExchange()).with(ROUTING_KEY);
    }

}
