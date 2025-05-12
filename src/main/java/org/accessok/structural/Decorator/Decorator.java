package org.accessok.structural.Decorator;
//装饰器抽象类
public abstract class Decorator implements Component {
    //组件
    protected Component component;
    //关联具体组件和装饰器，构造函数
    public Decorator(Component component) {
        this.component = component;
    }
    //通过装饰器调用组件业务逻辑
    @Override
    public void operation() {
        System.out.println("Decorator.operation()");
        component.operation();
    }
}
