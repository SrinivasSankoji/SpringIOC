package com.ioc.javaguides.service;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("SMS "+message);
	}
}
