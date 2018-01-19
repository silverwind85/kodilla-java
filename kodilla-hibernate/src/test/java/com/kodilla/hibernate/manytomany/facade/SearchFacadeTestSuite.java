package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    private int softwareMachineId;

    private int dataMaestersId;

    private int greyMatterId;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Before
    public void before() {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        this.softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        this.dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        this.greyMatterId = greyMatter.getId();
    }

    @After
    public void after() {
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testSearchCompany() {
        List<Company> result = searchFacade.processSearchCompany("Software Machine");
        List<Company> result2 = searchFacade.processSearchCompany("S");
        List<Company> result3 = searchFacade.processSearchCompany("M");

        Assert.assertEquals(1, result.size());
        Assert.assertEquals("Software Machine", result.get(0).getName());
        Assert.assertEquals("Software Machine", result2.get(0).getName());
        Assert.assertEquals(3, result3.size());


    }

    @Test
    public void testSearchEmployee() {
        List<Employee> result = searchFacade.processSearchEmployee("John Smith");
        List<Employee> result2 = searchFacade.processSearchEmployee("John");
        List<Employee> result3 = searchFacade.processSearchEmployee("o");


        Assert.assertEquals(1,result.size());
        Assert.assertEquals("Smith",result.get(0).getLastname());
        Assert.assertEquals(1,result2.size());
        Assert.assertEquals(3,result3.size());

    }
}
