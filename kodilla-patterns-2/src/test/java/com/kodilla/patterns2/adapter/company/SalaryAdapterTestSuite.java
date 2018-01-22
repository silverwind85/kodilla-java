package com.kodilla.patterns2.adapter.company;

import com.kodilla.adapter.company.SalaryAdapter;
import com.kodilla.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary(){
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //When
        double result = salaryAdapter.TotalSalary(workers.getWorkers(),workers.getSalaries());
        //Then
        System.out.println(result);
        assertEquals(result,27750,0);
    }
}
