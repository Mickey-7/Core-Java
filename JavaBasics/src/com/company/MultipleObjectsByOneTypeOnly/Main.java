package com.company.MultipleObjectsByOneTypeOnly;
//Creating multiple objects by one type only
public class Main {
    public static void main(String[] args) {
    //using constructors to initialize name with given value and display it.
        new Employee("Maurice",22).display();
        new Employee().display();
    }
}

class Employee{
    String name = "James";
    int age = 24;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println(name+" "+age);
    }
}
