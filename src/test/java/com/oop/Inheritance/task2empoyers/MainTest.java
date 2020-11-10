package com.oop.Inheritance.task2empoyers;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MainTest {
    private SalariedEmployee salariedEmployee;
    private ContractEmployee contractEmployee;

    @BeforeClass
    public void createObject() {
        salariedEmployee = new SalariedEmployee();
        contractEmployee = new ContractEmployee();
    }

    @Test
    public void calculatingForSeleriedEmployee() {
        salariedEmployee.setHourlyRate(80);
        salariedEmployee.setNumberOfHours(180);
        double actualResult = salariedEmployee.calculatePay();
        double expectedResult = 14400.0;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void calculatingForContractEmployee() {
        contractEmployee.setFixedMounthlyPay(55000);
        double actualResult = contractEmployee.calculatePay();
        double expectedResult = 55000.0;
        Assert.assertEquals(actualResult, expectedResult);
    }

}