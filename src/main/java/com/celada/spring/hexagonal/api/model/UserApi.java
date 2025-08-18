package com.celada.spring.hexagonal.api.model;

import java.util.List;

import lombok.Data;

@Data
public class UserApi {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<GameApi> games;
}