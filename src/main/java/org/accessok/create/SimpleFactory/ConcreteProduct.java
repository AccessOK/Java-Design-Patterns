package org.accessok.create.SimpleFactory;

//具体产品类
public class ConcreteProduct implements Product {
    @Override
    public void use() {
        System.out.println("ConcreteProduct的use()");
    }
}
