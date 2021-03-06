package com.ioc.javaguides.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ioc.javaguides.model.DBInitializer;

@Configuration
public class InitConfiguration {

	@Bean(initMethod = "init",destroyMethod = "destroy")
	public DBInitializer dbInitializer()
	{
		return new DBInitializer();
	}
}
