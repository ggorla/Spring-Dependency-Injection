package guru.example.SpringDependencyInjection.controllers;

import guru.example.SpringDependencyInjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructedIngectedControllerTest {

    ConstructedIngectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructedIngectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}