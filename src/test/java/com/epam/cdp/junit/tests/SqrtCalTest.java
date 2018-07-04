package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class SqrtCalTest extends BaseTest {

    @UseDataProvider("valuesForTest")
    @Test
    public void verifySqrtTest(double num1, double expectedResult){
        double result = calculator.sqrt(num1);
        Assert.assertEquals("Something went wrong with sqrting", expectedResult, result, 0.00001);
        //Assert.assertThrows(MathException);
    }


    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
                {4.0,2},
                {64,8.0},
                {567,23.811761799581316},
                {0,0},
                {-4,2}

        };
    }

}
