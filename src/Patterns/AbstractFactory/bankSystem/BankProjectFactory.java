package Patterns.AbstractFactory.bankSystem;

import Patterns.AbstractFactory.interfaces.Developer;
import Patterns.AbstractFactory.interfaces.ProjectManager;
import Patterns.AbstractFactory.interfaces.TeamProjectFactory;
import Patterns.AbstractFactory.interfaces.Tester;

public class BankProjectFactory implements TeamProjectFactory {
    @Override
    public Developer getDeveloper() {
        return new BankJavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new BankQATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankProjectManager();
    }
}
