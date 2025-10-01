package com.celada.spring.hexagonal.inbound.rest.controller;

import com.celada.openapi.api.TeamApi;
import com.celada.openapi.model.RestTeam;
import com.celada.spring.hexagonal.domain.model.Team;
import com.celada.spring.hexagonal.domain.service.TeamService;
import com.celada.spring.hexagonal.inbound.rest.adapter.TeamAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class TeamsController implements TeamApi {

    private final TeamService service;
    private final TeamAdapter adapter;

    public TeamsController(TeamService service, TeamAdapter adapter) {
        this.service = service;
        this.adapter = adapter;
    }

    @Override
    public ResponseEntity<List<RestTeam>> getTeams() {
        log.info("Get Team Controller");
        List<Team> teams = service.getTeams();
        List<RestTeam> response = adapter.map(teams);
        return ResponseEntity.ok(response);
    }
}
