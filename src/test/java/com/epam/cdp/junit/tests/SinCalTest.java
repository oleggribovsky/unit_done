package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SinCalTest extends BaseTest {
    @UseDataProvider("valuesForTest")
    @Test
    public void verifySinTest(double num1, double expectedResult){
        double result = calculator.sin(num1);
        Assert.assertEquals("Something went wrong with sin", expectedResult, result, 0.00001);
    }


    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
                {0,0},
                {Math.PI/6, 0.49999999999999994},
                {Math.PI/4, 0.7071067811865475},
                {Math.PI/3, Math.sqrt(3)/2},
                {Math.PI/2,1},
                {-Math.PI/4, -0.7071067811865475},

        };
    }


}
