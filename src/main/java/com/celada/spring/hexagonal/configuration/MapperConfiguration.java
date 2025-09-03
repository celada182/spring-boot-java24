package com.celada.spring.hexagonal.configuration;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public MapperFacade mapperFacade() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().mapNulls(false).build();

//        mapperFactory.classMap(Game.class, RestGame.class).customize(gameMapper).register();
//        mapperFactory.classMap(Team.class, RestTeam.class).customize(teamMapper).register();

        return mapperFactory.getMapperFacade();
    }
}
