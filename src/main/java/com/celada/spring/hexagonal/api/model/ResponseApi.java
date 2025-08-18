package com.celada.spring.hexagonal.api.model;

import lombok.Data;

@Data
public class ResponseApi {
    private Integer code;
    private String message;
}