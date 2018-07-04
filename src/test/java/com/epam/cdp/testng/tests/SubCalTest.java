package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalTest extends BaseTest {
    @Test
    public void verifySubLongTest(){


        Assert.assertEquals(calculator.sub(7, 2), 5, "Something went wrong with subtraction");
        Assert.assertEquals(calculator.sub(-2,-2), 0, "Something went wrong with subtraction");
        Assert.assertEquals(calculator.sub(-2,100), -102, "Something went wrong with subtraction");
        Assert.assertEquals(calculator.sub(100,-2), 102, "Something went wrong with subtraction");


    }
}
