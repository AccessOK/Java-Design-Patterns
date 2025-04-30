package org.accessok.create.Builder;

public class Student {
    private String name;
    private String age;
    private String number;
    private String address;

    public Student(StudentBuilder studentBuilder) {

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
    public static class StudentBuilder {
        private String name;
        private String age;
        private String number;
        private String address;
        public StudentBuilder builderName(String name) {
            this.name = name;
            return this;
        }
    }
}
