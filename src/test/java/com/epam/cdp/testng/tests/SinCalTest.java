package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalTest extends BaseTest {

    @Test(dataProvider="valuesForTest", groups = "trigonometric")
    public void verifySinTest(double num1, double expectedResult){
        double result = calculator.sin(num1);
        Assert.assertEquals(result, expectedResult, 0.001,"Something went wrong with sin");
    }


    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {0,0},
                {Math.PI/6, 0.5},
                {Math.PI/4, 0.707},
                {Math.PI/3, Math.sqrt(3)/2},
                {Math.PI/2,1},


        };
    }


}
