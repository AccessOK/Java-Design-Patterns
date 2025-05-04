import org.accessok.structural.Decorator.Component;
import org.accessok.structural.Decorator.ConcreteComponent;
import org.accessok.structural.Decorator.ConcreteDecorator;
import org.accessok.structural.Decorator.Decorator;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void DecoratorTest(){
        //创建组件
        Component component=new ConcreteComponent();
        //创建装饰器
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
