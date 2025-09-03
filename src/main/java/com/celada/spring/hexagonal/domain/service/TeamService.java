package com.celada.spring.hexagonal.domain.service;

import com.celada.spring.hexagonal.domain.model.Game;
import com.celada.spring.hexagonal.domain.model.Team;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class TeamService {
    public List<Team> getTeams() {
        log.info("Team Service - Get Teams");
        return mockTeams();
    }

    private List<Team> mockTeams() {
        return List.of(
                createTeam(1L, "KOI"),
                createTeam(2L, "G2"),
                createTeam(3L, "FNATIC")
        );
    }

    private Team createTeam(Long id, String name) {
        return Team.builder()
                .id(id)
                .name(name)
                .members(Collections.emptyList())
                .game(Game.builder().name("League Of Legends").build())
                .build();
    }
}
