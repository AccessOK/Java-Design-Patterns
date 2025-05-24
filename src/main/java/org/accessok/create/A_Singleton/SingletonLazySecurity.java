package org.accessok.create.A_Singleton;

public class SingletonLazySecurity {
    //volatile 保持多线程访问变量的可见性
    private volatile static SingletonLazySecurity instance;
    private SingletonLazySecurity() {}
    public static SingletonLazySecurity getInstance() {
        //synchronized 同一时刻只能有一个线程对他进行操作，保证变量和方法的原子性
        synchronized (SingletonLazySecurity.class) {
            if (instance == null) {
                instance = new SingletonLazySecurity();
            }
            return instance;
        }
    }
}
