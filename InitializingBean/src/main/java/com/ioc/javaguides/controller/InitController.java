package com.ioc.javaguides.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.javaguides.configuration.InitConfiguration;

public class InitController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitConfiguration.class);
		context.close();
	}
}
