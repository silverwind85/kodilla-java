package com.kodilla.hibernate;

import com.kodilla.hibernate.utill.EmployeesConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class KodillaHibernateApplication extends WebMvcConfigurerAdapter {
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new EmployeesConverter());

	}
	public static void main(String[] args) {
		SpringApplication.run(KodillaHibernateApplication.class, args);
	}
}
