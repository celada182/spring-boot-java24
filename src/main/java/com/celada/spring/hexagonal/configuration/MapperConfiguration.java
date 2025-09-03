package com.celada.spring.hexagonal.configuration;

import com.celada.spring.hexagonal.inbound.rest.mapper.GameMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public MapperFacade mapperFacade(GameMapper gameMapper) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().mapNulls(false).build();

//        mapperFactory.classMap(Game.class, RestGame.class).customize(gameMapper).register();

        return mapperFactory.getMapperFacade();
    }
}
