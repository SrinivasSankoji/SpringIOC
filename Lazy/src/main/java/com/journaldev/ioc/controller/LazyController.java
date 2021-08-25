package com.journaldev.ioc.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.journaldev.ioc.configuration.LazyConfiguration;
import com.journaldev.ioc.model.FirstBean;

public class LazyController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(LazyConfiguration.class);
		FirstBean firstBean=context.getBean(FirstBean.class);
		firstBean.test();
		context.close();
	}
	
}
