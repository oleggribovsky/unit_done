package com.epam.cdp.testng.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass (groups = {"trigonometric"})
    public void setUp(){

        calculator = new Calculator();

    }

    @AfterClass (groups = {"trigonometric"})
    public void tearDown(){
        calculator=null;
    }
}
