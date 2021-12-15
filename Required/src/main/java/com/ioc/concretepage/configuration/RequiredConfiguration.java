package com.ioc.concretepage.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ioc.concretepage.model.College;
import com.ioc.concretepage.model.Person;

@Configuration
public class RequiredConfiguration {

	@Bean
	public College college() {
		College college = new College();
		college.setName("Partibha Degree College");
		college.setLocation("Siddipet");
		return college;
	}
	@Bean
	public Person person(College college) {
		Person person = new Person();
		person.setCollege(college);
		return person;
	}
}
