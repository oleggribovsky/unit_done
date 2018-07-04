package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


public class SubDoubleCalTest extends BaseTest {

    @Test
    public void verifySubDoubleTest(){


        Assert.assertEquals("Something went wrong with subtraction", 5.3, calculator.sub(7.6, 2.3), 0.00001);
        Assert.assertEquals("Something went wrong with subtraction", -0.10000000000000009, calculator.sub(-2.9,-2.8), 0.00001);
        Assert.assertEquals("Something went wrong with subtraction", -103.80000000000001, calculator.sub(-2.9,100.9), 0.00001);
        Assert.assertEquals("Something went wrong with subtraction", 103.5, calculator.sub(100.9,-2.6), 0.00001);
    }
}
