package org.accessok;

import org.accessok.create.AbstractFactory.AbstractFactory;
import org.accessok.create.AbstractFactory.ConCreteFactory1;
import org.accessok.create.AbstractFactory.ProductA;
import org.accessok.create.AbstractFactory.ProductB;
import org.accessok.create.SimpleFactory.*;
import org.accessok.create.Singleton.SingletonHungry1;
import org.accessok.create.Singleton.SingletonHungry2;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //单例模式
        SingletonHungry1.getInstance();
        SingletonHungry2.getInstance();
        //简单工厂模式
        Product product= SimpleFactory.createProduct();
        product.use();
        //工厂方法模式
        Factory factory1=new Factory1();
        Product product1=factory1.createProduct();
        product1.use();
        Factory factory2=new Factory2();
        Product product2=factory2.createProduct();
        product2.use();
        //抽象工厂模式
        AbstractFactory factory=new ConCreteFactory1();
        ProductA product3=factory.createProductA();
        product3.use();
        ProductB product4=factory.createProductB();
        product4.use();
    }
}