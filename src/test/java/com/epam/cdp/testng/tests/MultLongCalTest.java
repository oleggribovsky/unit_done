package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultLongCalTest extends BaseTest {

    @Test
    public void verifyMultiplicationLongTest(){
        Assert.assertEquals(calculator.mult(2L,2L), 4L,"Multiplication of longs is not correct");
        Assert.assertEquals(calculator.mult(-2L,-2L), 4L,"Multiplication of longs is not correct");
        Assert.assertEquals(calculator.mult(-4L,2L), -8L,"Multiplication of longs is not correct");
        Assert.assertEquals(calculator.mult(0,0), 0,"Multiplication of longs is not correct");
    }
}
