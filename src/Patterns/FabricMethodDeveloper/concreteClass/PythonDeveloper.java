package Patterns.FabricMethodDeveloper.concreteClass;

import Patterns.FabricMethodDeveloper.interfaces.Developer;

public class PythonDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer write code.");
    }
}
