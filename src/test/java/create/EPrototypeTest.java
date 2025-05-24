package create;

import org.accessok.create.E_Prototype.ConcretePrototype;
import org.junit.Test;

public class EPrototypeTest {
    @Test
    public void Prototype() throws CloneNotSupportedException {
        ConcretePrototype prototype=new ConcretePrototype();
        prototype.setName("ascc");
        prototype.setAge(22);
        prototype.setNumber("110");
        ConcretePrototype prototype1=(ConcretePrototype) prototype.clone();
        System.out.println(prototype1);
    }
}
