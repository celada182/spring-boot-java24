package com.celada.spring.hexagonal.inbound.event.model;

import lombok.Data;

@Data
public class GameResponse {
    private String name;
    private Boolean multiplayer;
    private Long users;
    private Integer teamSize;
}
