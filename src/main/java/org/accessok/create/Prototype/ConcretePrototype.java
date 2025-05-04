package org.accessok.create.Prototype;
//具体需要克隆的对象
public class ConcretePrototype implements Prototype{
    private String name;
    private int age;
    private String number;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "ConcretePrototype [name=" + name + ", age=" + age + ", number=" + number + "]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
