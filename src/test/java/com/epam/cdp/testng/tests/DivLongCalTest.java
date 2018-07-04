package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivLongCalTest extends BaseTest{
    @Test(dataProvider="valuesForTest")
    public void verifyDivLongTest(long first, long second, long eResult){
        long result = calculator.div(first, second);
        Assert.assertEquals(result, eResult, "Something went wrong division, long");
    }

    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {100L, 7L,14L},
                {0L,100L,0L},
                {(long)-9,(long)4,(long)-2},

        };
    }
}
