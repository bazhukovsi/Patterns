package Patterns.AbstractFactory;

import Patterns.AbstractFactory.bankSystem.BankProjectFactory;
import Patterns.AbstractFactory.interfaces.Developer;
import Patterns.AbstractFactory.interfaces.ProjectManager;
import Patterns.AbstractFactory.interfaces.TeamProjectFactory;
import Patterns.AbstractFactory.interfaces.Tester;
import Patterns.AbstractFactory.websiteProject.WebProjectFactory;

import java.io.BufferedReader;

public class testAbstractFactory {
    public static void main(String[] args) {
        String factoryID = args[1];
        TeamProjectFactory factory = createFactory(factoryID);
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager projectManager = factory.getProjectManager();
        System.out.println("Creating  ...");
        developer.writeCode();
        tester.testCode();
        projectManager.projectPM();
    }

    public static TeamProjectFactory createFactory(String factoryID) {
        if (factoryID.equalsIgnoreCase("bank")) {
            return new BankProjectFactory();
        } else if (factoryID.equalsIgnoreCase("web")) {
            return new WebProjectFactory();
        }
        throw new RuntimeException("Incorrect string for factory....");
    }
}
