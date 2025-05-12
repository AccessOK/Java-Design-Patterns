package org.accessok.create.AbstractFactory;

//ProductA的具体类
public class ConcreteProductA1 implements ProductA {

    @Override
    public void use() {
        System.out.println("ConcreteProductA1.use");
    }
}
