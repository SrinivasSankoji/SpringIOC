package com.ioc.javaguides.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedInjection {

	private MessageService messageService;

	@Autowired
	@Qualifier("TwitterService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public void processMessage(String message) {
		messageService.sendMessage(message);
	}
}
