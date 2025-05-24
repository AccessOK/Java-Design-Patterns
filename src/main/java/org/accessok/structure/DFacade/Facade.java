package org.accessok.structure.DFacade;
//外观类,类似Controller 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    //构造函数
    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
    }
    //组合子系统业务逻辑
    public void performOperations(){
        subSystemA.operationA();
        subSystemB.operationB();
    }
}
