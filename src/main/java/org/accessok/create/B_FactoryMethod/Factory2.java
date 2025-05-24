package org.accessok.create.B_FactoryMethod;

public class Factory2 implements Factory {

    @Override
    public Product createProduct() {
        return new Product2();
    }
}
