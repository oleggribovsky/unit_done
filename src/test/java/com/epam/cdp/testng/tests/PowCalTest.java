package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowCalTest extends BaseTest {

    @Test
    public void verifyPowTest(){

        Assert.assertEquals(calculator.pow(3,3), 27.0, "Something went wrong with Pow");
        Assert.assertEquals(calculator.pow(6.7,3), 300.763, 0.001,  "Something went wrong with Pow");
        Assert.assertEquals(calculator.pow(3.1,3.5), 29.791, 0.001, "Something went wrong with Pow");
        Assert.assertEquals(calculator.pow(3.1111,0), 1.0, "Something went wrong with Pow");
    }

}
