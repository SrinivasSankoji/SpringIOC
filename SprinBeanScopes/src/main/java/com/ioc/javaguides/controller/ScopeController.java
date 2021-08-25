package com.ioc.javaguides.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.javaguides.configuration.ScopeConfiguration;
import com.ioc.javaguides.model.UserService;

public class ScopeController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ScopeConfiguration.class);
		UserService service=context.getBean(UserService.class);
		service.setName("Singleton Scope");
		System.out.println(service.getName());
		
		UserService service1=context.getBean(UserService.class);
		System.out.println(service1.getName());
		context.close();
	}
}
