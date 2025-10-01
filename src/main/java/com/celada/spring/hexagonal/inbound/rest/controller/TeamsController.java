package com.celada.spring.hexagonal.inbound.rest.controller;

import com.celada.openapi.api.TeamsApi;
import com.celada.openapi.model.RestTeam;
import com.celada.spring.hexagonal.domain.model.Team;
import com.celada.spring.hexagonal.domain.service.TeamService;
import com.celada.spring.hexagonal.inbound.rest.adapter.TeamAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class TeamsController implements TeamsApi {

    private final TeamService service;
    private final TeamAdapter adapter;

    public TeamsController(TeamService service, TeamAdapter adapter) {
        this.service = service;
        this.adapter = adapter;
    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<RestTeam>> getTeams() {
        log.info("Get Team Controller");
        List<Team> teams = service.getTeams();
        List<RestTeam> response = adapter.map(teams);
        return ResponseEntity.ok(response);
    }
}
