package com.journaldev.ioc.qualifier.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.journaldev.ioc.qualifier.configuration.QualifierConfiguration;
import com.journaldev.ioc.qualifier.service.MessageProcessor;

public class QualifierController {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(QualifierConfiguration.class);
		MessageProcessor messageProcessor=context.getBean(MessageProcessor.class);
		messageProcessor.processMsg("Qualifier Example");
		context.close();
	}

}
