package com.celada.spring.hexagonal.inbound.event;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaProducer {

    public static final String TOPIC = "testing";

    private final KafkaTemplate<String, MyEvent> kafkaTemplate;

    public void sendFlightEvent(MyEvent event){
        String key = event.getKey();
        kafkaTemplate.send(TOPIC, key , event);
        log.info("Producer produced the message {}", event);
        // write your handlers and post-processing logic, based on your use case
    }

    @Data
    class MyEvent {
        private String key;
        // other variables state, based on your use case
    }
}
