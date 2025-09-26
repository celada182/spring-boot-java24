package com.celada.spring.hexagonal.inbound.event;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class EventConsumer {
    @KafkaListener(
            topics = "first-topic",
            groupId = "first-group",
            properties = {
                    "max.poll.interval.ms:4000",
                    "max.poll.records:50"
            })
    public void listen(List<ConsumerRecord<String, String>> messages) {
        for (ConsumerRecord<String, String> message : messages) {
            log.info("Partition = {}, Offset = {}, Key = {}, Value = {}", message.partition(), message.offset(), message.key(), message.value());
        }
    }
}
