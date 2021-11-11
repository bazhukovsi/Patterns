package Patterns.AbstractFactory.websiteProject;

import Patterns.AbstractFactory.interfaces.ProjectManager;

public class WebProjectManager implements ProjectManager {
    @Override
    public void projectPM() {
        System.out.println("Project manager for create sites....");
    }
}
