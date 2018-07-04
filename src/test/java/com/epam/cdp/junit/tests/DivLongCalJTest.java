package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DivLongCalJTest extends BaseTest{
    @UseDataProvider("valuesForTest")
    @Test
    public void verifyDivLongTest(long first, long second, long eResult){
        long result = calculator.div(first, second);
        Assert.assertEquals("Something went wrong division, long", eResult, result, 0.000001);
    }

    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
                {100L, 7L,14L},
                {0L,100L,0L},
                {-9,4,-2},

        };
    }
}
