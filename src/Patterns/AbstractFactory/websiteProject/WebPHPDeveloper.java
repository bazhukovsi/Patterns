package Patterns.AbstractFactory.websiteProject;

import Patterns.AbstractFactory.interfaces.Developer;

public class WebPHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer write code web site.");
    }
}
