package com.celada.spring.hexagonal.api.model;

import java.util.List;

import lombok.Data;

@Data
public class TeamApi {
    private Long id;
    private String name;
    private List<UserApi> members;
    private GameApi game;
}