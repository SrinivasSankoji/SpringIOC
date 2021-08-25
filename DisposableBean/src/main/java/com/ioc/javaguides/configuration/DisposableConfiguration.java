package com.ioc.javaguides.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ioc.javaguides.model"})
public class DisposableConfiguration {

}
