package com.epam.cdp.testng;

import com.epam.cdp.testng.listeners.TestListeners;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args){

        TestNG testNG = new TestNG();
        //testNG.addListener(new TestListeners());


//        XmlSuite suite = new XmlSuite();
//        suite.setSuiteFiles(Arrays.asList("./src/test/resources/testng.xml"));
//        List<XmlSuite> suites = new ArrayList<>();
//        suites.add(suite);
//        testNG.setXmlSuites(suites);
//        testNG.run();


        List<String> xmlFiles = new ArrayList<String>();
        xmlFiles.add("./src/test/resources/testng.xml");
        testNG.setTestSuites(xmlFiles);
        testNG.run();

    }

}
