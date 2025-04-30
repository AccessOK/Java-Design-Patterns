package org.accessok.create.SimpleFactory;

//简单工厂类
public class SimpleFactory {

    //通过工厂类直接创建实例
    public static Product createProduct() {
        System.out.println("createProduct");
        return new ConcreteProduct();
    }
}
