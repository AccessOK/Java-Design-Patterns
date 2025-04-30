package org.accessok.create;

public class SingletonHungry2 {
    private static SingletonHungry2 instance;
    private SingletonHungry2() {}
    //提供一个全局访问的点来访问这个实例,
    //延迟加载，即在真正需要使用对象时才创建该单例对象。
    // 这种方式可以减少程序启动时的资源消耗，但需要考虑线程安全问题。
    // 在多线程环境下，如果多个线程同时访问并试图创建单例对象，
    // 可能会导致创建多个实例，因此需要通过同步机制来保证只创建一个实例。
    public static SingletonHungry2 getInstance() {
        if (instance == null) {
            instance = new SingletonHungry2();
            System.out.println("懒汉式单例");
        }
        return instance;
    }
}
