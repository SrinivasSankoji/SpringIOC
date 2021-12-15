package com.ioc.concretepage.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class College implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String location;
}
