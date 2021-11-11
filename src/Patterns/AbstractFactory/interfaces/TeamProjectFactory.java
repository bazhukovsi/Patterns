package Patterns.AbstractFactory.interfaces;

public interface TeamProjectFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
