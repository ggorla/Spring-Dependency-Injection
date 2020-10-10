package guru.example.SpringDependencyInjection.controllers;

import guru.example.SpringDependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class I18nController {
    private  final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayGreeting(){
        return(greetingService.sayGreeting());
    }
}
