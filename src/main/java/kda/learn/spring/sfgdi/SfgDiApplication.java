package kda.learn.spring.sfgdi;

import kda.learn.spring.sfgdi.controllers.MyController;
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
	}

}
