package com.company.ThisKeyword;

public class Employee {

    String name;
    int age;


    public Employee(String name, int age) {
        //this keyword in java is used to refer to current object or instance of class.
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("John",20);
        System.out.println("Employee's name : "+e1.getName());
        System.out.println("Employee's age : "+e1.getAge());
    }

}
