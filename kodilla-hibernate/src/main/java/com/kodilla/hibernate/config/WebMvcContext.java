package com.kodilla.hibernate.config;

import com.kodilla.hibernate.utill.EmployeesConverter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebMvcContext extends WebMvcConfigurerAdapter {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new EmployeesConverter());

    }

}
