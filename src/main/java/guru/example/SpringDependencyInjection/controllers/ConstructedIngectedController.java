package guru.example.SpringDependencyInjection.controllers;

import guru.example.SpringDependencyInjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructedIngectedController {
    private  final GreetingService greetingService;


    public ConstructedIngectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
