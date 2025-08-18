package com.celada.spring.hexagonal.domain.model;

import java.util.List;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Game> games;
}