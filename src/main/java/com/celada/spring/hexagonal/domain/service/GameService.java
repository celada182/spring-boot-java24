package com.celada.spring.hexagonal.domain.service;

import com.celada.spring.hexagonal.domain.model.Game;
import com.celada.spring.hexagonal.outbound.event.GameEventProducer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class GameService {

    @Autowired
    private final GameEventProducer gameEventProducer;

    public List<Game> getGames() {
        log.info("Game Service - Get Games");
        List<Game> games = mockGames();
        for (Game game : games) {
            gameEventProducer.send(game);
        }
        return games;
    }

    public void readGameEvent(Game game) {
        log.info("Game = {}", game);
    }

    private List<Game> mockGames() {
        return List.of(
                createGame(1L, "League Of Legends"),
                createGame(2L, "Marvel Rivals"),
                createGame(3L, "Overwatch")
        );
    }

    private Game createGame(Long id, String name) {
        return Game.builder()
                .id(id)
                .name(name)
                .teamSize(5)
                .users(100L)
                .multiplayer(true)
                .build();
    }
}
