package org.accessok.create.B_FactoryMethod;

//简单工厂类
public class SimpleFactory {

    //通过工厂类直接创建实例
    public Product createProduct() {
        System.out.println("createProduct");
        return new ConcreteProduct();
    }
}
