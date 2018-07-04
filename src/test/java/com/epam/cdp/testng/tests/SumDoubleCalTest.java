package com.epam.cdp.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleCalTest extends BaseTest {



    @Test(dataProvider="valuesForTest")
    public void verifySumDoubleTest(double num1, double num2, double result1){
        double result = calculator.sum(num1,num2);
        Assert.assertEquals(result, result1, 0.001, "Something went wrong with summarizing");
    }


    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {1.9,2.3,4.2},
                {8.34,-5.04,3.3},
                {-5.5,-7.45,-12.95},
                {0.0,0.000,0.000}
        };
    }

}
