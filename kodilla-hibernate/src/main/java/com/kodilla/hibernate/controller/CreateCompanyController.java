package com.kodilla.hibernate.controller;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateCompanyController {

    @Autowired
    private CompanyDao companyDao;

    @GetMapping("createCompany")
    public String addProduct(Model model){
        model.addAttribute("company",new Company());
        return "createCompany";
    }
    @PostMapping("createCompany")
    public String addProduct(Model model, @ModelAttribute Company company, BindingResult result){
        Employee employee = company.getEmployees().get(0);
        company.getEmployees().add(employee);
        employee.getCompanies().add(company);


        companyDao.save(company);
        return "redirct:productList";
    }


}
