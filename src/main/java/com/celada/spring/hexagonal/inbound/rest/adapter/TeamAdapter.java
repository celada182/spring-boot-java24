package com.celada.spring.hexagonal.inbound.rest.adapter;

import com.celada.openapi.model.RestTeam;
import com.celada.spring.hexagonal.domain.model.Team;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamAdapter {

    private final MapperFacade mapper;

    public TeamAdapter(MapperFacade mapper) {
        this.mapper = mapper;
    }

    public List<RestTeam> map(List<Team> teams) {
        return teams.stream()
                .map(team -> mapper.map(team, RestTeam.class))
                .toList();
    }
}
