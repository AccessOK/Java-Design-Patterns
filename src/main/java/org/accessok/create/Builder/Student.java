package org.accessok.create.Builder;

public class Student {
    private String name;
    private String age;
    private String number;
    private String address;

    //私有构造函数，提供给StudentBuilder类创建实例
    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.number = builder.number;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", number=" + number + ", address=" + address+"]";
    }

    public static class StudentBuilder{
        private String name;
        private String age;
        private String number;
        private String address;
        //创建产品类的具体属性
        public StudentBuilder buildName(String name){
            this.name=name;
            return this;
        }
        public StudentBuilder buildAge(String age){
            this.age=age;
            return this;
        }
        public StudentBuilder buildNumber(String number){
            this.number=number;
            return this;
        }
        public StudentBuilder buildAddress(String address){
            this.address=address;
            return this;
        }
        //创建产品类
        public Student build(){
            return new Student(this);
        }
    }
}
