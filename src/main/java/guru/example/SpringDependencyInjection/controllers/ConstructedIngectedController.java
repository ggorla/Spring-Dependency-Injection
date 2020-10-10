package guru.example.SpringDependencyInjection.controllers;

import guru.example.SpringDependencyInjection.services.GreetingService;

public class ConstructedIngectedController {
    private  final GreetingService greetingService;

    public ConstructedIngectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
