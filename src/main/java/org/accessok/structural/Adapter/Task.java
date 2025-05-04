package org.accessok.structural.Adapter;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {
    private Integer input;
    //构造函数
    public Task(Integer input) {
        this.input = input;
    }
    @Override
    public Integer call() throws Exception {
        int r=0;
        for (int i=0;i<input;i++) {
            r+=i;
        }
        System.out.println("ConcreteComponent.Task.call(): "+r);
        return r;
    }
}
