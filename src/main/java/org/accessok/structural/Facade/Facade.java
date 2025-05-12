package org.accessok.structural.Facade;
//外观类,类似Controller
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
