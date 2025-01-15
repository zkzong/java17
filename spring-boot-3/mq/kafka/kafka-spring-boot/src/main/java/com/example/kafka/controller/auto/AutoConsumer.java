package com.example.kafka.controller.auto;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AutoConsumer {

    /**
     * 使用 message 接受消息
     */
    @KafkaListener(topics = "users", groupId = "group_id_1")
    public void consume1(String message) {
        log.info(String.format("$$ -> Consumed Message -> %s", message));
    }

    /**
     * 使用 record 接受消息
     */
    @KafkaListener(topics = "users", groupId = "group_id_2")
    public void consume2(ConsumerRecord record) {
        log.info(String.format("$$ -> Consumed Message -> %s", record));
    }

}
