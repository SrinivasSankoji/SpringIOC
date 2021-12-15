package com.ioc.javaguides.service;

import org.springframework.stereotype.Service;

@Service("TwitterService")
//@Primary
public class TwitterService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Twitter "+message);
	}
}
