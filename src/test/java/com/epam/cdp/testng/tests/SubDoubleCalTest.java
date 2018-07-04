package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SubDoubleCalTest extends BaseTest {

    @Test
    public void verifySubDoubleTest(){


        Assert.assertEquals(calculator.sub(7.6, 2.3), 5.3, "Something went wrong with subtraction");
        Assert.assertEquals(calculator.sub(-2.9,-2.8), -0.10000000000000009, "Something went wrong with subtraction");
        Assert.assertEquals(calculator.sub(-2.9,100.9), -103.80000000000001, "Something went wrong with subtraction");
        Assert.assertEquals(calculator.sub(100.9,-2.6), 103.5, "Something went wrong with subtraction");
    }
}
