package com.ioc.javaguides.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.javaguides.configuration.DisposableConfiguration;

public class DisposableController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				DisposableConfiguration.class);
		context.close();
	}

}
