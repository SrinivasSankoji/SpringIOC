package com.journaldev.ioc.qualifier.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.journaldev.ioc.qualifier.service.EmailService;
import com.journaldev.ioc.qualifier.service.MessageService;
import com.journaldev.ioc.qualifier.service.SMSService;

@Configuration
@ComponentScan("com.journaldev.ioc.qualifier.service")
@Import(ImportConfiguration.class)
public class QualifierConfiguration {

	@Bean(name = "emailService")
	public MessageService emailService() {
		return new EmailService();
	}

	@Bean(name = "smsService")
	public MessageService smsService() {
		return new SMSService();
	}

}
