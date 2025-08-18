package com.celada.spring.hexagonal.domain.model;

import lombok.Data;

@Data
public class Game {
    private Long id;
    private String name;
    private Boolean multiplayer;
    private Long users;
    private Integer teamSize;
}