package com.celada.spring.hexagonal.inbound.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventProducer {

    @Autowired
    private KafkaTemplate<String, String> template;

    public void send() {
        for (int i = 0; i < 200; i++) {
            template.send("first-topic", String.valueOf(i), String.format("Sample message %d", i));
        }
    }
}
