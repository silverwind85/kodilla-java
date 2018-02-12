package com.kodilla.hibernate.utill;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.core.convert.converter.Converter;

public class EmployeesConverter implements Converter<String,Employee> {
    @Override
    public Employee convert(String source) {
        return new Employee(source,"");
    }
}
