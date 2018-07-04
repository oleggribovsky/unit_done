package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubCalTest extends  BaseTest{
    @Test(dataProvider = "valuesForTest")
    public void verifyMultiplicationDoubleTest(Double first, double second, double eResult){
        Assert.assertEquals(calculator.mult(first, second), eResult,"Multiplication of doubles is not correct");

    }


    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {2.2,-4,-8.8},
                {-2345.2,-2,4690.4},
                {7.345,2,14.69},

        };
    }
}
