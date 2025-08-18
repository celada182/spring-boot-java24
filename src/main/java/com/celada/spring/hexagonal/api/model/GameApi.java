package com.celada.spring.hexagonal.api.model;

import lombok.Data;

@Data
public class GameApi {
    private Long id;
    private String name;
    private Boolean multiplayer;
    private Long users;
    private Integer teamSize;
}