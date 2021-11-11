package Patterns.FabricMethodDeveloper;

import Patterns.FabricMethodDeveloper.factoryClass.CppDeveloperFactory;
import Patterns.FabricMethodDeveloper.factoryClass.JavaDeveloperFactory;
import Patterns.FabricMethodDeveloper.factoryClass.PythonDeveloperFactory;
import Patterns.FabricMethodDeveloper.interfaces.Developer;
import Patterns.FabricMethodDeveloper.interfaces.DeveloperFactory;

public class TestDeveloperFactory {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperByString("Cpp");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    public static DeveloperFactory createDeveloperByString(String developerStringId){
        if (developerStringId.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (developerStringId.equalsIgnoreCase("python")){
            return new PythonDeveloperFactory();
        } else if (developerStringId.equalsIgnoreCase("cpp")){
            return new CppDeveloperFactory();
        }
        throw new RuntimeException("Incorrect string for developer type");
    }
}
