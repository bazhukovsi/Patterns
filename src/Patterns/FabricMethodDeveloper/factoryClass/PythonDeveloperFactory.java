package Patterns.FabricMethodDeveloper.factoryClass;

import Patterns.FabricMethodDeveloper.concreteClass.PythonDeveloper;
import Patterns.FabricMethodDeveloper.interfaces.Developer;
import Patterns.FabricMethodDeveloper.interfaces.DeveloperFactory;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
