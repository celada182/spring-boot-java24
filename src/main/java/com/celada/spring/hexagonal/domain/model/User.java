package com.celada.spring.hexagonal.domain.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Game> games;
}