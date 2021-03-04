package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Employee;

@SpringBootApplication
public class PocSpringbootcrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PocSpringbootcrudApplication.class, args);
		System.out.println("welcome to spring boot");
		
		// for the simple spring boot demo
		/*
		 * Employee employee =context.getBean(Employee.class);
		 * 
		 * employee.show(); Employee employee1 =context.getBean(Employee.class);
		 * 
		 * employee1.show();
		 */
	}

}
