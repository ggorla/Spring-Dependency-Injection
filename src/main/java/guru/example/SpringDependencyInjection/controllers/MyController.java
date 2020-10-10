package guru.example.SpringDependencyInjection.controllers;

import guru.example.SpringDependencyInjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello(){

        return greetingService.sayGreeting();
    }
}
