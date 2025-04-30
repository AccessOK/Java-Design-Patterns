package org.accessok.create.Singleton;

public class SingletonHungry3 {
    //volatile 同一时刻只能有一个线程对他进行操作，
    private volatile static SingletonHungry3 instance;
    private SingletonHungry3() {}
    public static SingletonHungry3 getInstance() {
        synchronized (SingletonHungry3.class) {
            if (instance == null) {
                instance = new SingletonHungry3();
            }
            return instance;
        }
    }
}
