package com.epam.cdp.junit.tests;

import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;
import org.junit.AfterClass;



public class BaseTest {

    protected static Calculator calculator;

    @BeforeClass
    public static void setUp(){

        calculator = new Calculator();

    }

    @AfterClass
    public static void tearDown(){
        calculator=null;
    }
}
