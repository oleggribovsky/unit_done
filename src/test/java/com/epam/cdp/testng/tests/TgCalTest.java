package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalTest extends BaseTest{

    @Test (groups = "trigonometric")
    public void verfyTg1Test(){
        Assert.assertEquals(calculator.tg(0), Math.tan(0), "Something went wrong with tan");

    }

    @Test (groups = "trigonometric")
    public void verfyTg2Test(){

        double argument = Math.PI/6;

        Assert.assertEquals(calculator.tg(Math.PI/6), Math.sin(argument)/Math.cos(argument), "Something went wrong with tan");

    }

    @Test (groups = "trigonometric")
    public void verfyTg3Test(){


        Assert.assertEquals(calculator.tg(Math.PI/4), 1.0, "Something went wrong with tan");
    }
}
