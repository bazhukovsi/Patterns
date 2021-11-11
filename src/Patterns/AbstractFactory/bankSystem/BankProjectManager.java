package Patterns.AbstractFactory.bankSystem;

import Patterns.AbstractFactory.interfaces.ProjectManager;

public class BankProjectManager implements ProjectManager {
    @Override
    public void projectPM() {
        System.out.println("Project manager manage bank system.");
    }
}
