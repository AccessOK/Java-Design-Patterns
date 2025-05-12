package org.accessok.create.SimpleFactory;

public class Factory1 implements Factory {

    @Override
    public Product createProduct() {
        return new Product1();
    }
}
