package com.company.UsingMethod;
//Using Method
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();
        //Initialize object values
        employee.initialize("Martin",24);
        employee1.initialize("John",23);
        //Calling display method
        employee.display();
        employee1.display();

    }
}

class Employee{
    String name;
    int age;

    void initialize(String name, int age){
        this.name = name;
        this.age = age;

    }

    void display(){
        System.out.println(name+" "+age);

    }
}
