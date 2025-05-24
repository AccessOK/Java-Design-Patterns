package create;

import org.accessok.create.B_FactoryMethod.Factory;
import org.accessok.create.B_FactoryMethod.Factory1;
import org.accessok.create.B_FactoryMethod.Product;
import org.accessok.create.B_FactoryMethod.SimpleFactory;
import org.junit.Test;

public class BFactoryMethodTest {
    //简单工厂模式，将类创建和类本身的功能分开，只有唯一工厂（简单工厂），一个产品接口/抽象类，根据简单工厂中的静态方法来创建具体产品对象，不符合开闭原则
    @Test
    public void Create_SimpleFactory() {
        SimpleFactory simpleFactory=new SimpleFactory();
        Product product=simpleFactory.createProduct();
        product.use();
    }
    //工厂方法模式，有多个工厂（抽象工厂+多个具体工厂），一个产品接口/抽象类，根据继承抽象工厂中的方法来多态创建具体产品对象，新增产品时，新增工厂类即可
    @Test
    public void Create_FactoryMethod() {
        Factory factory1=new Factory1();
        Product product=factory1.createProduct();
        product.use();
    }
}
