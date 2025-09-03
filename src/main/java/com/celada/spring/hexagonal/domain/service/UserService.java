package com.celada.spring.hexagonal.domain.service;

import com.celada.spring.hexagonal.domain.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class UserService {
    public List<User> getUsers() {
        log.info("User Service - Get User");
        return mockUsers();
    }

    private List<User> mockUsers() {
        return List.of(
                createUser(1L, "Javier"),
                createUser(2L, "Maria"),
                createUser(3L, "Julio")
        );
    }

    private User createUser(Long id, String name) {
        return User.builder()
                .id(id)
                .name(name)
                .email("email")
                .games(Collections.emptyList())
                .build();
    }
}
