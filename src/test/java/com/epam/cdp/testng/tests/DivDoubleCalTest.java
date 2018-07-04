package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleCalTest extends BaseTest {
    @Test(dataProvider="valuesForTest")
    public void verifyDivDoubleTest(double first, double second, double eResult){
        double result = calculator.div(first, second);
        Assert.assertEquals(result, eResult, "Something went wrong with division, double");

    }

    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {(double)100,(double)10,(double)10.0},
                {0,100,0.0},
                {-8,4,-2.0}

        };
    }
}
