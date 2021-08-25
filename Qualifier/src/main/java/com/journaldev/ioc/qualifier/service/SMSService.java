package com.journaldev.ioc.qualifier.service;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService{

	@Override
	public void sendMsg(String message) {
		System.out.println("SMS "+message);
	}

}
