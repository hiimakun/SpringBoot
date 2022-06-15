package com.hiimakun.spring.helloworld.Springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	private static Food context;

	public static void main(String[] args) {
		//ApplicationContext là containẻ, chứa toàn bộ các bean
		ApplicationContext context = SpringApplication.run(App.class, args);
		//Sau khi chạy, context sẽ chứa các Bean có annotation @Component

		//Gọi bean
		Food food = context.getBean(Food.class);
		System.out.println("Output instance: "+food);
		food.eat();

		//Sau khi sử dụng autowired
		Human human = context.getBean(Human.class);
		System.out.println("Human instance: "+human);
		System.out.println("Human rice :"+human.food);

		human.food.eat();

	}

}
