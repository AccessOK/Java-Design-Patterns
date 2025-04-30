package org.accessok.create.Singleton;
public class SingletonHungry1 {
    //直接实例化
    //static 修饰属性（静态变量/类变量），多个对象共享同一个静态变量，
    //  当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时是修改过得。
    //  静态变量随着累的加载而加载，会赋默认值。
    //  静态变量的加载要早于对象的创建。
    //  由于类只会加载一次，则静态变量在内存中也只会存在一份，在方法区的静态域中。
    //  静态方法只能调用静态的方法或属性，非静态则都能调用。
    //  静态方法不能被重写

    //final 只能被赋值一次（对基本类型来说其值不可变，对引用类型来说其引用不可变，及不能指向其他对象）
    // final方法不能被子类重写
    // final 类不能被继承，没有子类，其方法默认都是final

    //类加载时创建实例
    private static final SingletonHungry1 instance=new SingletonHungry1();
    //构造器私有化，不让随意创建实例
    private SingletonHungry1(){}
    //提供一个全局访问的点来访问这个实例
    public static SingletonHungry1 getInstance(){
        System.out.println("饿汉单例模型！");
        return instance;
    }
}