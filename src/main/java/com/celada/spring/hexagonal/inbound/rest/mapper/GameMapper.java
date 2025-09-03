package com.celada.spring.hexagonal.inbound.rest.mapper;

import com.celada.openapi.model.RestGame;
import com.celada.spring.hexagonal.domain.model.Game;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

@Component
public class GameMapper extends CustomMapper<Game, RestGame> {
    @Override
    public void mapAtoB(Game a, RestGame b, MappingContext context) {

    }

    @Override
    public void mapBtoA(RestGame b, Game a, MappingContext context) {

    }
}
