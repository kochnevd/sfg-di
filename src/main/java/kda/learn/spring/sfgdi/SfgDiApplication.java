package kda.learn.spring.sfgdi;

import kda.learn.spring.sfgdi.controllers.ConstructorInjectedController;
import kda.learn.spring.sfgdi.controllers.MyController;
import kda.learn.spring.sfgdi.controllers.PropertyInjectedController;
import kda.learn.spring.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController ctrlr = (MyController) ctx.getBean("myController");

		String s = ctrlr.sayHello();

		System.out.println(s);

		System.out.println("------- property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
