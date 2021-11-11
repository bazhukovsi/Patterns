package Patterns.FabricMethodDeveloper.factoryClass;

import Patterns.FabricMethodDeveloper.concreteClass.CppDeveloper;
import Patterns.FabricMethodDeveloper.interfaces.Developer;
import Patterns.FabricMethodDeveloper.interfaces.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
