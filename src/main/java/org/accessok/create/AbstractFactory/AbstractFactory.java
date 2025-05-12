package org.accessok.create.AbstractFactory;


//抽象工厂方法，创建多个不太具体实例类型时不用修改源码，只需要添加创建类
public interface AbstractFactory {
    //使用一个接口，定义创建的所有产品抽象类
    ProductA createProductA();
    ProductB createProductB();
}
