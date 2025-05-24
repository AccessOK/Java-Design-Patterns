package org.accessok.structure.CAdapter;

import java.util.concurrent.Callable;

public class RunnableAdapter implements Runnable{
    //引用待转换的接口，适配类与原有的类具有相同的接口，并且持有新的目标对象。
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
