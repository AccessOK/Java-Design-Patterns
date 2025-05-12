import org.accessok.create.Prototype.ConcretePrototype;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void testClone() throws CloneNotSupportedException {
        ConcretePrototype prototype=new ConcretePrototype();
        prototype.setName("ascc");
        prototype.setAge(22);
        prototype.setNumber("110");
        ConcretePrototype prototype1=(ConcretePrototype) prototype.clone();
        System.out.println(prototype1);
    }
}
