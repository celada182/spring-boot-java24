package com.celada.spring.hexagonal.inbound.rest.controller;

import com.celada.openapi.api.GameApi;
import com.celada.openapi.model.ApiGame;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class GameController implements GameApi {
    @Override
    public ResponseEntity<Void> createGame(ApiGame apiGame) {
        return null;
    }

    @Override
    public ResponseEntity<List<ApiGame>> getGames() {
        return null;
    }
}
