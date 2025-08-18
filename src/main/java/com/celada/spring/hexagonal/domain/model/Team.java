package com.celada.spring.hexagonal.domain.model;

import java.util.List;

import lombok.Data;

@Data
public class Team {
    private Long id;
    private String name;
    private List<User> members;
    private Game game;
}