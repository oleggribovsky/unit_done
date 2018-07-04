package com.epam.cdp.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        //System.out.println("On test start: "+ result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //System.out.println("On test success: "+ result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("On test Failure: "+ result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
