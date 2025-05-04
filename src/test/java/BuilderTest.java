import org.accessok.create.Builder.AbstractBuilder;
import org.accessok.create.Builder.ConcreteBuilder;
import org.accessok.create.Builder.Director;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void buildTest(){
        System.out.println("hello");
        //创建创建者对象
        ConcreteBuilder builder=new ConcreteBuilder();
        //使用指挥者直接传参调用
        Director director=new Director(builder);
        director.create("setPart1","setPart2");
        System.out.println(builder.getProduct());
        //不适用指挥者
        ConcreteBuilder builder2=new ConcreteBuilder();
        builder2.buildPart1("setPartA");
        //产品类的子创建可以部分创建部分不创建
        builder2.buildPart2("setPartB");
        System.out.println(builder2.getProduct());
    }
}
