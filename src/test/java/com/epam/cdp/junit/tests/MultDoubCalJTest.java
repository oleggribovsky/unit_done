package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class MultDoubCalJTest extends  BaseTest{
    @UseDataProvider("valuesForTest")
    @Test
    public void verifyMultiplicationDoubleTest(Double first, double second, double eResult){
        Assert.assertEquals("Multiplication of doubles is not correct", eResult, calculator.mult(first, second));

    }


    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
                {2.2,-4,-8.8},
                {-2345.2,-2,4690.4},
                {7.345,2,14.69},

        };
    }
}
