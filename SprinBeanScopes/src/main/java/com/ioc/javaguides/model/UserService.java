package com.ioc.javaguides.model;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
//@Scope("prototype")
public class UserService {

	private String name;
}
