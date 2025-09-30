package com.celada.spring.hexagonal.inbound.event;

import com.celada.spring.hexagonal.domain.model.Game;
import com.celada.spring.hexagonal.domain.service.GameService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class EventConsumer {

    private final GameService service;
    private final ObjectMapper objectMapper;

    public EventConsumer(GameService service) {
        this.service = service;
        this.objectMapper = new ObjectMapper();
    }

    @KafkaListener(
            topics = "api-game",
            groupId = "api-game-group",
            properties = {
                    "max.poll.interval.ms:4000",
                    "max.poll.records:50"
            })
    public void listen(List<ConsumerRecord<String, String>> messages) {
        for (ConsumerRecord<String, String> message : messages) {
            try {
                Game response = objectMapper.readValue(message.value(), Game.class);
                log.info("Partition = {}, Offset = {}, Key = {}", message.partition(), message.offset(), message.key());
                service.readGameEvent(response);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
