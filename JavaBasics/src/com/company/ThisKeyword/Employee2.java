package com.company.ThisKeyword;

public class Employee2 {
    String name;
    int age;

    public Employee2(String name,int age)
    {
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

    public Employee2 getEmployee()
    {
        //this keyword can be used return object of the class
        return this;
    }
    public static void main(String args[])
    {
        Employee2 e1=new Employee2("John",20);
        Employee2 e1Copy=e1.getEmployee();
        System.out.println("Employee's name : "+e1Copy.getName());
        System.out.println("Employee's age : "+e1Copy.getAge());
    }

}
