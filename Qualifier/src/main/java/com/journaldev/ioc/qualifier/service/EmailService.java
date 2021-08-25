package com.journaldev.ioc.qualifier.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

	@Override
	public void sendMsg(String message) {
		System.out.println("Email "+message);
	}

}
