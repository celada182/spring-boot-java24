package com.celada.spring.hexagonal.inbound.rest.controller;

import com.celada.openapi.api.GameApi;
import com.celada.openapi.model.RestGame;
import com.celada.spring.hexagonal.domain.model.Game;
import com.celada.spring.hexagonal.domain.service.GameService;
import com.celada.spring.hexagonal.inbound.rest.adapter.GameAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class GameController implements GameApi {

    private final GameService service;
    private final GameAdapter adapter;

    public GameController(GameService service, GameAdapter adapter) {
        this.service = service;
        this.adapter = adapter;
    }

    @Override
    public ResponseEntity<Void> createGame(RestGame game) {
        return null;
    }

    @Override
    public ResponseEntity<List<RestGame>> getGames() {
        log.info("Get Game Controller");
        List<Game> games = service.getGames();
        List<RestGame> response = adapter.map(games);
        return ResponseEntity.ok(response);
    }
}
