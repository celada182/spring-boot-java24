package com.celada.spring.hexagonal.domain.service;

import com.celada.spring.hexagonal.domain.model.Game;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class GameService {
    public List<Game> getGames() {
        log.info("Game Service - Get Games");
        return mockGames();
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
