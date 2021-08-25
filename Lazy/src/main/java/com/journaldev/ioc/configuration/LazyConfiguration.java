package com.journaldev.ioc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.journaldev.ioc.model.FirstBean;
import com.journaldev.ioc.model.SecondBean;

@Configuration
public class LazyConfiguration {

	@Bean
	@Lazy(value = true)
	public FirstBean firstBean() {
		return new FirstBean();
	}
	
	@Bean
	public SecondBean secondBean() {
		return new SecondBean();
	}
}
