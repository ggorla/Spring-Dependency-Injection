package guru.example.SpringDependencyInjection.controllers;

import guru.example.SpringDependencyInjection.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void  setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
