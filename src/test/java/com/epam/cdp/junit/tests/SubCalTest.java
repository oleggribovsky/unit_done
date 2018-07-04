package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


public class SubCalTest extends BaseTest {
    @Test
    public void verifySubLongTest(){


        Assert.assertEquals("Something went wrong with subtraction", 5, calculator.sub(7, 2));
        Assert.assertEquals("Something went wrong with subtraction", 0, calculator.sub(-2,-2), 0.00001);
        Assert.assertEquals("Something went wrong with subtraction", -102, calculator.sub(-2,100), 0.00001);
        Assert.assertEquals("Something went wrong with subtraction", 102, calculator.sub(100,-2), 0.00001);


    }
}
