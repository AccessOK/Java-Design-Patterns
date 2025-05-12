package org.accessok.structural.Decorator;

//具体装饰器
public class ConcreteDecorator extends Decorator{
    //构造函数
    public ConcreteDecorator(Component component){
        //装饰器模式强调的是增强自身，在被装饰之后你能够在被增强的类上使用增强后的功能。增强后你还是你，只不过能力更强了而已；
        super(component);
    }
    @Override
    public void operation() {
        super.operation();
        //增强后的代码
        System.out.println("ConcreteDecorator operation");
    }
}
