package org.accessok.structure.AProxy;

public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

}
