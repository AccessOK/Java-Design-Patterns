package org.accessok.create.AbstractFactory;

//ProductB的具体类
public class ConcreteProductB1 implements ProductB {

    @Override
    public void use() {
        System.out.println("ConcreteProductB1.use");
    }
}
