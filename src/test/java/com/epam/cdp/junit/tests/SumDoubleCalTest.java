package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class SumDoubleCalTest extends BaseTest {


@UseDataProvider("valuesForTest")
    @Test
    public void verifySumDoubleTest(double num1, double num2, double eResult){
        double result = calculator.sum(num1,num2);
        Assert.assertEquals("Something went wrong with summarizing", eResult, result, 0.00001 );
    }


    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
                {1.9,2.3,4.2},
                {8.34,-5.04,3.3},
                {-5.5,-7.45,-12.95},
                {0.0,0.000,0.000}
        };
    }

}
