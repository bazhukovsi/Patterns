package Patterns.AbstractFactory.websiteProject;

import Patterns.AbstractFactory.interfaces.Tester;

public class WebTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester for web sites tests...");
    }
}
