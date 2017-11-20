package io.github.fabiodelabruna.sf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.github.fabiodelabruna.sf.model.User;
import io.github.fabiodelabruna.sf.service.UserService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Main.class.getPackage().getName());
		
		User user = new User("Fabio Dela Bruna");
		
		UserService userService = applicationContext.getBean(UserService.class);
		userService.save(user);

		UserService userService2 = applicationContext.getBean(UserService.class);
		
		if (userService == userService2) {
			System.out.println("São iguais!");
		} else {
			System.out.println("Não são iguais!");
		}
		
		applicationContext.close();
		
		System.out.println("Fim!");
	}

}
