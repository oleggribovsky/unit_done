package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalTest extends BaseTest {

    @Test(dataProvider="valuesForTest", groups = "trigonometric")
    public void verifyCosTest(double degree, double eResult){
        double result = calculator.cos(degree);
        Assert.assertEquals(result, eResult, "Something went wrong with taking cosinus");
    }

    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {0, 1},
                {Math.PI/3, 0.5},
                {Math.PI/2, 0},

        };
    }
}
