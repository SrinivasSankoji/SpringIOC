package com.journaldev.ioc.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.journaldev.ioc.configuration.PropertySourceConfiguration;

public class PropertySourceController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext conetxt = new AnnotationConfigApplicationContext(
				PropertySourceConfiguration.class);
		conetxt.close();
	}
}
