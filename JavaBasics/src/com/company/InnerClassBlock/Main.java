package com.company.InnerClassBlock;
//Using Anonymous Inner Class Block
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(){
            {
                initialize("Martin", 23);
            }
        };
        // Call display Method to check value
        employee.display();

    }
}

class Employee{
    String name;
    int age;

    void initialize(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println(name+" "+age);
    }
}
