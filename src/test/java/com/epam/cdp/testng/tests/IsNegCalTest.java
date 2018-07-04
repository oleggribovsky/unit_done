package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegCalTest extends BaseTest {

    @Test(groups ="Logical tests")
    public void verifyIsNegativeTest(){

        Assert.assertFalse(calculator.isNegative(5L), "Something went wrong");
        Assert.assertTrue(calculator.isNegative(-5L), "Something went wrong");
        Assert.assertFalse(calculator.isNegative(5000), "Something went wrong");
        Assert.assertTrue(calculator.isNegative(-746789457L), "Something went wrong");


    }




}
