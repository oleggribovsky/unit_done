package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class IsPosCalJTest extends BaseTest{

    @Test
    public void verifyIsPositiveTest(){

        Assert.assertTrue("Something went wrong", calculator.isPositive(5L));
        Assert.assertFalse("Something went wrong", calculator.isPositive(-5L));
        Assert.assertTrue("Something went wrong", calculator.isPositive(5000765));
        Assert.assertFalse("Something went wrong", calculator.isPositive(-746789457L));
        Assert.assertFalse("Something went wrong", calculator.isPositive(0L));

    }
}
