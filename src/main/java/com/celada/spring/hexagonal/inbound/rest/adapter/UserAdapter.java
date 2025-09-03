package com.celada.spring.hexagonal.inbound.rest.adapter;

import com.celada.openapi.model.RestUser;
import com.celada.spring.hexagonal.domain.model.User;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAdapter {

    private final MapperFacade mapper;

    public UserAdapter(MapperFacade mapper) {
        this.mapper = mapper;
    }

    public List<RestUser> map(List<User> users) {
        return users.stream()
                .map(user -> mapper.map(user, RestUser.class))
                .toList();
    }
}
