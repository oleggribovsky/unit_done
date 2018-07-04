package com.epam.cdp.testng.tests;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalTest extends BaseTest {



    @Test(dataProvider="valuesForTest")
    public void verifySumLongTest(long num1, long num2, long result1){
        long result = calculator.sum(num1,num2);
        Assert.assertEquals(result, result1, "Something went wrong with summarizing");
    }


    @DataProvider(name="valuesForTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
            {1,2,3},
            {8,-5,3},
            {-5,-7,-12},
            {0,0,0}
        };
    }




}
