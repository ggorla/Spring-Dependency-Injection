package guru.example.SpringDependencyInjection.controllers;

import guru.example.SpringDependencyInjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();

    }

    PropertyInjectedController controller;


    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}