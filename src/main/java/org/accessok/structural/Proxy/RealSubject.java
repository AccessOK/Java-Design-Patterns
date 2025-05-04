package org.accessok.structural.Proxy;

public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

}
