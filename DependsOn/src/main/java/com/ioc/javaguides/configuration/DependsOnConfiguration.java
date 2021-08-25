package com.ioc.javaguides.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.ioc.javaguides.model.FirstBean;
import com.ioc.javaguides.model.SecondBean;
import com.ioc.javaguides.model.ThirdBean;

@Configuration
public class DependsOnConfiguration {

	@Bean
	@DependsOn(value = { "secondBean","thirdBean"})
	public FirstBean firstBean() {
		return new FirstBean();
	}

	@Bean
	public SecondBean secondBean() {
		return new SecondBean();
	}

	@Bean
	public ThirdBean thirdBean() {
		return new ThirdBean();
	}
}
