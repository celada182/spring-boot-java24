package com.celada.spring.hexagonal.inbound.event;

import com.celada.spring.hexagonal.inbound.event.model.GameResponse;
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
            GameResponse response = new GameResponse();
            response.setName("Game " + i);
            response.setMultiplayer(true);
            response.setUsers(10L);
            response.setTeamSize(2);

            try {
                String message = objectMapper.writeValueAsString(response);
                template.send("api-game", String.valueOf(i), message);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
