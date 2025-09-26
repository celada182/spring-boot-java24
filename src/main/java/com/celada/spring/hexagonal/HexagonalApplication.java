package com.celada.spring.hexagonal;

import com.celada.spring.hexagonal.inbound.event.EventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HexagonalApplication implements CommandLineRunner {

    @Autowired
    private EventProducer eventProducer;

    public static void main(String[] args) {
        SpringApplication.run(HexagonalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        eventProducer.send();
    }
}
