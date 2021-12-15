package com.ioc.javaguides.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.javaguides.configuration.DependencyInjectionConfiguration;
import com.ioc.javaguides.service.ConstructorBasedInjection;

public class ConstructorInjectionController {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				DependencyInjectionConfiguration.class);
		ConstructorBasedInjection constructorBasedInjection=context.getBean(ConstructorBasedInjection.class);
		constructorBasedInjection.processMessage("Constructor Injection ");
		context.close();
	}
}
