package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPosCalTest extends BaseTest{

    @Test(groups ="Logical test")
    public void verifyIsPositiveTest(){

        Assert.assertTrue(calculator.isPositive(5L), "Something went wrong");
        Assert.assertFalse(calculator.isPositive(-5L), "Something went wrong");
        Assert.assertTrue(calculator.isPositive(5000765), "Something went wrong");
        Assert.assertFalse(calculator.isPositive(-746789457L), "Something went wrong");
        Assert.assertFalse(calculator.isPositive(0L), "Something went wrong");

    }
}
