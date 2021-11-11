package Patterns.FabricMethodDeveloper.factoryClass;

import Patterns.FabricMethodDeveloper.concreteClass.JavaDeveloper;
import Patterns.FabricMethodDeveloper.interfaces.Developer;
import Patterns.FabricMethodDeveloper.interfaces.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
