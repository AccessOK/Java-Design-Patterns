package org.accessok.create.Builder;
//指挥者,负责使用创建者类创建具体的产品流程，将产品创建者的分布流程整合成，方便调用。
public class Director {
    //定义具体的创建者
    private ConcreteBuilder builder;
    //构造函数注入创建者
    public Director(ConcreteBuilder builder) {
        this.builder = builder;
    }
    //调用创建者创建产品类
    public Product create(String part1, String part2) {
        builder.buildPart1(part1);
        builder.buildPart2(part2);
        return builder.getProduct();
    }
}
