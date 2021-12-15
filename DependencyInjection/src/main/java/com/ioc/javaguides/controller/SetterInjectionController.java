package com.ioc.javaguides.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.javaguides.configuration.DependencyInjectionConfiguration;
import com.ioc.javaguides.service.SetterBasedInjection;

public class SetterInjectionController {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				DependencyInjectionConfiguration.class);
		SetterBasedInjection bean=context.getBean(SetterBasedInjection.class);
		bean.processMessage("Setter Based Injection Example");
		context.close();
	}
}
