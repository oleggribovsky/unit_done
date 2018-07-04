package com.epam.cdp.junit.tests;



import com.epam.cdp.junit.tests.BaseTest;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SumCalTest extends BaseTest {


@UseDataProvider("valuesForTest")
    @Test
    public void verifySumLongTest(long num1, long num2, long eResult){
        long result = calculator.sum(num1,num2);
        Assert.assertEquals("Something went wrong with summarizing", eResult, result, 0.00001);
    }


    @DataProvider
    public static Object[][] valuesForTest(){
        return new Object[][] {
            {1,2,3},
            {8,-5,3},
            {-5,-7,-12},
            {0,0,0}
        };
    }




}
