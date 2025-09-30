package com.celada.spring.hexagonal.outbound.event;

import com.celada.spring.hexagonal.domain.model.Game;

public interface GameEventProducer {
    public void send(Game game);
}
