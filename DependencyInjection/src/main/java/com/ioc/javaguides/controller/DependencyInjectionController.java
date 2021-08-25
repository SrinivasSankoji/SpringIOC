package com.ioc.javaguides.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.javaguides.configuration.DependencyInjectionConfiguration;
import com.ioc.javaguides.service.SetterBasedInjection;

public class DependencyInjectionController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				DependencyInjectionConfiguration.class);
		//ConstructorBasedInjection bean=context.getBean(ConstructorBasedInjection.class);
		SetterBasedInjection bean=context.getBean(SetterBasedInjection.class);
		//MessageService bean=context.getBean(MessageService.class); // @Primary Annotation Example
		bean.processMessage("Setter Based Injection Example");
		context.close();
	}
}
