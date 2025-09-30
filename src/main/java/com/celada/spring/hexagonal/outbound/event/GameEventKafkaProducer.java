package com.celada.spring.hexagonal.outbound.event;

import com.celada.spring.hexagonal.domain.model.Game;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GameEventKafkaProducer implements GameEventProducer {

    private final ObjectMapper objectMapper;
    private KafkaTemplate<String, String> template;

    public void send(Game game) {
        try {
            String message = objectMapper.writeValueAsString(game);
            template.send("api-game", "Game-" + game.getId(), message);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
