package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DivDoubleCalJTest extends BaseTest {
    @UseDataProvider("valuesForTest")
    @Test
    public void verifyDivDoubleTest(double first, double second, double eResult){
        double result = calculator.div(first, second);
        Assert.assertEquals("Something went wrong with division", eResult, result, 0.001);

    }

    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
                {100.0,10.0,10.0},
                {0.0,100.0,0.0},
                {-8,4,-2.0}

        };
    }
}
