package org.accessok.structural.Decorator;
//具体组件
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent.operation()");
    }
}
