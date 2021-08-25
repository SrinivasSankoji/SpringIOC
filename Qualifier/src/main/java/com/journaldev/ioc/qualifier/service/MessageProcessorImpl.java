package com.journaldev.ioc.qualifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessorImpl implements MessageProcessor{

	@Autowired
	@Qualifier("twitterService")
 	private MessageService messageService;

	@Override
	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
