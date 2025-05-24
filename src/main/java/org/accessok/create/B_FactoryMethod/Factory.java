package org.accessok.create.B_FactoryMethod;

//抽象出工厂方法，创建多个不太具体实例类型时不用修改源码，只需要添加创建类
public interface Factory {
    Product createProduct();
}
