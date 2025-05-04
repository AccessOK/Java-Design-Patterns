package org.accessok.structural.Bridge;
//扩充抽现象话角色，修改后的抽象类
public abstract class RefinedCar extends Car {
    //构造原来的Car
    public RefinedCar(Engine engine) {
        super(engine);
    }
    public void drive() {
        //启动引擎
        this.engine.start();
        System.out.println("RefinedCar::drive");
    }
    //给Car添加品牌
    public abstract String getBrand();
}
