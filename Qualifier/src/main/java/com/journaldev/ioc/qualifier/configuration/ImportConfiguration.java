package com.journaldev.ioc.qualifier.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.journaldev.ioc.qualifier.service.MessageService;
import com.journaldev.ioc.qualifier.service.TwitterService;

@Configuration
@ComponentScan("com.journaldev.ioc.qualifier.service")
public class ImportConfiguration {

	@Bean(name = "twitterService")
	public MessageService twitterService() {
		return new TwitterService();
	}
}
