package com.celada.spring.hexagonal.inbound.rest.mapper;

import com.celada.openapi.model.RestTeam;
import com.celada.spring.hexagonal.domain.model.Team;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper extends CustomMapper<Team, RestTeam> {
    @Override
    public void mapAtoB(Team a, RestTeam b, MappingContext context) {

    }

    @Override
    public void mapBtoA(RestTeam b, Team a, MappingContext context) {

    }
}
