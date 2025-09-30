package com.celada.spring.hexagonal.outbound.event;

import com.celada.spring.hexagonal.domain.model.Game;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventProducer {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private KafkaTemplate<String, String> template;

    public void send() {
        for (int i = 0; i < 200; i++) {
            Game game = Game.builder()
                    .name("Game " + i)
                    .multiplayer(true)
                    .users(10L)
                    .teamSize(2)
                    .build();

            try {
                String message = objectMapper.writeValueAsString(game);
                template.send("api-game", String.valueOf(i), message);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
