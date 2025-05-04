package org.accessok.structural.Adapter;

import java.util.concurrent.Callable;

public class RunnableAdapter implements Runnable{
    //引用带转换的接口
    private Callable<Integer> task;
    //构造函数
    public RunnableAdapter(Callable<Integer> task) {
        this.task = task;
    }
    @Override
    public void run() {
        // 将指定接口调用委托给转换接口调用:
        try {
            task.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
