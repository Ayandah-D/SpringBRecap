package com.learn.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(ExampleApplication.class, args);
		
		//MyFirstClass myFirstClass = new MyFirstClass();
		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
	}

//	@Bean this can be used to run the class as a bean
//	public MyFirstClass myFirstClass(){
//		return new MyFirstClass();
//	}
}
