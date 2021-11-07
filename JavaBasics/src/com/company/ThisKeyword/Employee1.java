package com.company.ThisKeyword;
public class Employee1 {
    String name;
    int age;

    public Employee1() {
        System.out.println("Calling No arg constructor");
    }

    public Employee1(String name,int age)
    {
        //If you want to call overloaded constructor of same class,
        // you can use this keyword to do that.
        //Please note that this keyword used for calling another constructor should be first statement in that constructor.
        this();
        System.out.println("Calling Parameterized constructor");
        this.name=name;
        this.age=age;
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

    public static void main(String args[])
    {
        Employee1 e1=new Employee1("John",20);
        System.out.println("Employee's name : "+e1.getName());
        System.out.println("Employee's age : "+e1.getAge());
    }
}
