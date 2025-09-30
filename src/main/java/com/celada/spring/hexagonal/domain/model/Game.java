package com.celada.spring.hexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private Long id;
    private String name;
    private Boolean multiplayer;
    private Long users;
    private Integer teamSize;
}