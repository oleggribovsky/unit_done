package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalTest extends BaseTest{
    @Test(dataProvider="valuesForTest", groups = "trigonometric")
    public void verifyCtgTest(double degree, double eResult){
        double result = calculator.ctg(degree);
        Assert.assertEquals(result, eResult, "Something went wrong with catangens");
    }

    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {Math.PI/4, 1},
                {Math.PI/2, 0},

        };
    }
}
