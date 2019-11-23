package com.example.aspects;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AspectsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AspectsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Adder adder = (Adder) context.getBean("adder");
		adder.add(1,2);
		adder.add(100,100);
	}
}
