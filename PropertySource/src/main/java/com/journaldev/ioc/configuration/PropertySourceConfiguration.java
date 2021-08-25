package com.journaldev.ioc.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class PropertySourceConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource datasource() {
		System.out.println(environment.getProperty("spring.datasource.name"));
		return null;

	}
}
