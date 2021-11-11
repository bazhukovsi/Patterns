package Patterns.FabricMethodDeveloper.concreteClass;

import Patterns.FabricMethodDeveloper.interfaces.Developer;

public class CppDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp Developer write code.");
    }
}
