package create;

import org.accessok.create.A_Singleton.SingletonHungry;
import org.accessok.create.A_Singleton.SingletonLazy;
import org.accessok.create.A_Singleton.SingletonLazySecurity;
import org.junit.Test;

//单例模式
//  一个类只有一个实例，并提供一个访问该实例的全局访问点
public class ASingletonTest {
    //饿汉单例模式，不管是否使用，类加载时都实例对象
    @Test
    public void Create_SingletonHungry() {
        SingletonHungry instance=SingletonHungry.getInstance();
    }
    //懒汉单例模式，只有在使用时才创建对象，多线程同时访问，可能同时创建对象，线程不安全
    @Test
    public void Create_SingletonLazy() {
        SingletonLazy instance= SingletonLazy.getInstance();
    }
    //线程安全懒汉单例模式
    @Test
    public void Create_SingletonLazySecurity() {
        SingletonLazySecurity instance= SingletonLazySecurity.getInstance();
    }
}
