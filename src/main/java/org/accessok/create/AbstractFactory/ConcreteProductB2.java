package org.accessok.create.AbstractFactory;

//ProductB的具体类
public class ConcreteProductB2 implements ProductB {

    @Override
    public void use() {
        System.out.println("ConcreteProductB2 use");
    }
}
