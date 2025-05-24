package create;

import org.accessok.create.B_FactoryMethod.Factory1;
import org.accessok.create.B_FactoryMethod.Product;
import org.accessok.create.C_AbstractFactory.AbstractFactory;
import org.accessok.create.C_AbstractFactory.ConCreteFactory1;
import org.accessok.create.C_AbstractFactory.ProductA;
import org.junit.Test;

public class CAbstractFactoryTest {
    //抽象工厂模式 有多个工厂（抽象工厂+多个具体工厂），多个产品接口/抽象类，对产品子类进行分组，根据继承抽象工厂中的方法多态创建同组的不同具体产品对象
    @Test
    public void Create_AbstractFactory() {
        AbstractFactory factory=new ConCreteFactory1();
        ProductA producta=factory.createProductA();
        producta.use();
    }
}
