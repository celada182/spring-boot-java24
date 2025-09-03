package com.celada.spring.hexagonal.inbound.rest.adapter;

import com.celada.openapi.model.RestGame;
import com.celada.spring.hexagonal.domain.model.Game;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameAdapter {

    private final MapperFacade mapper;

    public GameAdapter(MapperFacade mapper) {
        this.mapper = mapper;
    }

    public List<RestGame> map(List<Game> games) {
        return games.stream()
                .map(game -> mapper.map(game, RestGame.class))
                .toList();
    }
}
