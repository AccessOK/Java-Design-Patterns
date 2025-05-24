package org.accessok.create.D_Builder;

//具体创建类
public class ConcreteBuilder extends AbstractBuilder{
    //创建产品类
    private Product product =  new Product();
    //构建产品的part1部分
    @Override
    public void buildPart1(String part1) {
        product.setPart1(part1);
    }
    //构建产品的part2部分
    @Override
    public void buildPart2(String part2) {
        product.setPart2(part2);
    }
    //提供返回产品的方法
    @Override
    public Product getProduct() {
        return this.product;
    }
}
