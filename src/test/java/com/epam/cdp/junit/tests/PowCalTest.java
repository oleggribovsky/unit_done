package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;



public class PowCalTest extends BaseTest {

    @Test
    public void verifyPowTest(){

        Assert.assertEquals("Something went wrong with Pow", 27.0, calculator.pow(3,3), 0.0001);
        Assert.assertEquals("Something went wrong with Pow", 29.791000000000004, calculator.pow(3.1,3), 0.0001);
        Assert.assertEquals("Something went wrong with Pow", 29.791000000000004, calculator.pow(3.1,3.5), 0.0001);
        Assert.assertEquals("Something went wrong with Pow", 1.0, calculator.pow(3.1111,0), 0.0001);
    }

}
