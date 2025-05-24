package org.accessok.structure.EBridge;
//抽象化角色
public abstract class Car {
    //引用Engine
    protected  Engine engine;
    //构造函数
    public Car(Engine engine) {
        this.engine = engine;
    }
    public abstract void drive();
}
