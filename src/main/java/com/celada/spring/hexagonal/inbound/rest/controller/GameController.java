package com.celada.spring.hexagonal.inbound.rest.controller;

import com.celada.openapi.api.GameApi;
import com.celada.openapi.model.ApiGame;
import com.celada.spring.hexagonal.domain.model.Game;
import com.celada.spring.hexagonal.domain.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class GameController implements GameApi {

    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<Void> createGame(ApiGame apiGame) {
        return null;
    }

    @Override
    public ResponseEntity<List<ApiGame>> getGames() {
        log.info("Get Game Controller");
        List<Game> games = service.getGames();
        return null;
    }
}
