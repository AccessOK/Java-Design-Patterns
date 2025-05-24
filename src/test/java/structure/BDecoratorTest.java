package structure;

import org.accessok.structure.BDecorator.Component;
import org.accessok.structure.BDecorator.ConcreteComponent;
import org.accessok.structure.BDecorator.ConcreteDecorator;
import org.accessok.structure.BDecorator.Decorator;
import org.junit.Test;

public class BDecoratorTest {
    @Test
    public void DecoratorTest(){
        //创建组件
        Component component=new ConcreteComponent();
        //创建装饰器
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
