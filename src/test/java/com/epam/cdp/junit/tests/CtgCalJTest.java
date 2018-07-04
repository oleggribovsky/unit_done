package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class CtgCalJTest extends BaseTest{
    @UseDataProvider("valuesForTest")
    @Test
    public void verifyCtgTest(double degree, double eResult){
        double result = calculator.ctg(degree);
        Assert.assertEquals("Something went wrong with catangens", eResult, result, 0.000001);
    }

    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
                {Math.PI/4, 1},
                {Math.PI/2, 0},

        };
    }
}
