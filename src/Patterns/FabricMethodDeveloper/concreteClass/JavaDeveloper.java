package Patterns.FabricMethodDeveloper.concreteClass;

import Patterns.FabricMethodDeveloper.interfaces.Developer;

public class JavaDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer write code");
    }
}
