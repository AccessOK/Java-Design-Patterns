package org.accessok.structural.Proxy;

public class Proxy implements Subject{
    //代理类
    private RealSubject realSubject;
    @Override
    public void doSomething(){
        if(realSubject == null) {
            realSubject = new RealSubject();
        }
        //前置处理
        System.out.println("RealSubject start");
        realSubject.doSomething();
        //后置处理
        System.out.println("RealSubject end");
    }
}
