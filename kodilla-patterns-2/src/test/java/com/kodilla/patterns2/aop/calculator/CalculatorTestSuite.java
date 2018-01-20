package com.kodilla.patterns2.aop.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);
    @Test
    public void testAdd(){
        double result = calculator.add(10,10);
        LOGGER.info("Testing add method");
        Assert.assertEquals(20,result,2);
    }
    @Test
    public void testSub(){
        double result = calculator.sub(10,10);
        LOGGER.info("Testing sub method");
        Assert.assertEquals(0,result,2);
    }
    @Test
    public void testMul(){
        double result = calculator.mul(10,10);
        LOGGER.info("Testing mul method");
        Assert.assertEquals(100,result,2);
    }
    @Test
    public void testDiv(){
        double result = calculator.div(10,10);
        LOGGER.info("Testing div method");
        Assert.assertEquals(0,result,2);
    }
    @Test
    public void testFactorial(){
        //When
        BigDecimal result = calculator.factorial(new BigDecimal(3));
        BigDecimal result1 = calculator.factorial(new BigDecimal(1000));
        //Given
        Assert.assertEquals(new BigDecimal(6),result);
        LOGGER.info("Testing factorial method");
        System.out.println(result1);
        Assert.assertTrue( BigDecimal.ONE.compareTo(result1)<0);


    }
}
