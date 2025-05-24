package org.accessok.create.C_AbstractFactory;

public class ConCreteFactory1 implements AbstractFactory {
    //在工厂方法中具体实现需要创建的产品类
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
