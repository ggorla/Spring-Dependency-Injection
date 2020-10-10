package guru.example.SpringDependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting(){
        return "hello World-Property";
    }
}
