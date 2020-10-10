package guru.example.SpringDependencyInjection;

import guru.example.SpringDependencyInjection.controllers.ConstructedIngectedController;
import guru.example.SpringDependencyInjection.controllers.MyController;
import guru.example.SpringDependencyInjection.controllers.PropertyInjectedController;
import guru.example.SpringDependencyInjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);


		System.out.println("---property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--- setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--Constructor");
		ConstructedIngectedController constructedIngectedController = (ConstructedIngectedController) ctx.getBean("constructedIngectedController");
		System.out.println(constructedIngectedController.getGreeting());
	}

}
