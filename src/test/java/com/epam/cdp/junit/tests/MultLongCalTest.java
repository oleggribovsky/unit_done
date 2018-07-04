package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


public class MultLongCalTest extends BaseTest {

    @Test
    public void verifyMultiplicationLongTest(){
        Assert.assertEquals("Something went wrong with with multiplication",calculator.mult(2L,2L), 4L);
        Assert.assertEquals("Something went wrong with with multiplication",calculator.mult(-2L,-2L), 4L);
        Assert.assertEquals("Something went wrong with with multiplication",calculator.mult(-4L,2L), -8L);
        Assert.assertEquals("Something went wrong with with multiplication",calculator.mult(0,0), 0);

    }
}
