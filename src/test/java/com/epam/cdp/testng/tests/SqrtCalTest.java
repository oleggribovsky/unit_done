package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTest {


    @Test(dataProvider="valuesForTest")
    public void verifySqrtTest(double num1, double expectedResult){
        double result = calculator.sqrt(num1);
        Assert.assertEquals(result, expectedResult, 0.01,"Something went wrong with sqrting");
        //Assert.assertThrows(MathException);
    }


    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {4.0,2},
                {64,8.0},
                {567,23.81},
                {0,0},
                {-4,2}

        };
    }

}
