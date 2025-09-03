package com.celada.spring.hexagonal.inbound.rest.controller;

import com.celada.openapi.api.UserApi;
import com.celada.openapi.model.RestUser;
import com.celada.spring.hexagonal.domain.model.User;
import com.celada.spring.hexagonal.domain.service.UserService;
import com.celada.spring.hexagonal.inbound.rest.adapter.UserAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class UserController implements UserApi {

    private final UserService service;
    private final UserAdapter adapter;

    public UserController(UserService service, UserAdapter adapter) {
        this.service = service;
        this.adapter = adapter;
    }

    @Override
    public ResponseEntity<List<RestUser>> getUsers() {
        log.info("Get User Controller");
        List<User> users = service.getUsers();
        List<RestUser> response = adapter.map(users);
        return ResponseEntity.ok(response);
    }
}
