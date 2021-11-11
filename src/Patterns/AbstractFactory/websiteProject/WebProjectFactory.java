package Patterns.AbstractFactory.websiteProject;

import Patterns.AbstractFactory.interfaces.Developer;
import Patterns.AbstractFactory.interfaces.ProjectManager;
import Patterns.AbstractFactory.interfaces.TeamProjectFactory;
import Patterns.AbstractFactory.interfaces.Tester;

public class WebProjectFactory implements TeamProjectFactory {
    @Override
    public Developer getDeveloper() {
        return new WebPHPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new WebTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebProjectManager();
    }
}
