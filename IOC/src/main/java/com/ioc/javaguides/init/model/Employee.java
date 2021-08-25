package com.ioc.javaguides.init.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
}
