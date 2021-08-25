package com.ioc.javaguides.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.javaguides.configuration.DependsOnConfiguration;
import com.ioc.javaguides.model.FirstBean;

public class DepndsOnController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
		FirstBean firstBean=context.getBean(FirstBean.class);
		firstBean.populateBeans();
		context.close();
	}
}
