package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class CosCalJTest extends BaseTest {

    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
                {0, 1},
                {Math.PI/3, 0.5},
                {Math.PI/2, 0},

        };
    }

    @UseDataProvider("valuesForTest")
    @Test
    public void verifyCosTest(double degree, double eResult){
        System.out.println(calculator.cos(degree));
        Assert. assertEquals("Something went wrong with taking cosinus", eResult, calculator.cos(degree), 0.000001);
    }


}
