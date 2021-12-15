package com.ioc.concretepage.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.concretepage.configuration.RequiredConfiguration;
import com.ioc.concretepage.model.Person;

public class RequiredController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				RequiredConfiguration.class);
		Person person = context.getBean(Person.class);
		System.out.println(person.getCollege().getName());
		context.close();
	}

}
