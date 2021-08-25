package com.ioc.javaguides.configuration;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ioc.javaguides.model.UserService;

@Configuration
@ComponentScan("com.ioc.javaguides.model")
public class ScopeConfiguration {

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public UserService userService()
	{
		return new UserService();	
	}
}
