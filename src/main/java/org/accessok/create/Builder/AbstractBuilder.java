package org.accessok.create.Builder;
// 抽象创建者类
public abstract class AbstractBuilder {
    //创建Part1部分
    public abstract void buildPart1(String part1);
    //创建Part2部分
    public abstract void buildPart2(String part2);
    //创建完成后获取对象
    public abstract Product getProduct();
}
