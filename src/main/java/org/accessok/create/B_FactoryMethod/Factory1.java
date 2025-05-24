package org.accessok.create.B_FactoryMethod;

public class Factory1 implements Factory {

    @Override
    public Product createProduct() {
        return new Product1();
    }
}
