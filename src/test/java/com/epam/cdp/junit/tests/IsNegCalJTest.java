package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class IsNegCalJTest extends BaseTest {

    @Test
    public void verifyIsNegativeTest(){

        Assert.assertFalse("Something went wrong", calculator.isNegative(5L));
        Assert.assertTrue("Something went wrong", calculator.isNegative(-5L));
        Assert.assertFalse("Something went wrong", calculator.isNegative(5000));
        Assert.assertTrue("Something went wrong", calculator.isNegative(-746789457L));


    }




}
