package com.epam.cdp.junit.tests;

import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;



public class TgCalTest extends BaseTest{

    @Test
    public void verfyTg1Test(){
        Assert.assertEquals("Something went wrong with tan", Math.tan(0), calculator.tg(0), 0.00001);

    }

    @Test
    public void verfyTg2Test(){

        double argument = Math.PI/6;

        Assert.assertEquals("Something went wrong with tan", Math.sqrt(3)/3, calculator.tg(Math.PI/6), 0.000001);

    }

    @Test
    public void verfyTg3Test(){


        Assert.assertEquals("Something went wrong with tan", 1.0, calculator.tg(Math.PI/4), 0.00001);
    }
}
