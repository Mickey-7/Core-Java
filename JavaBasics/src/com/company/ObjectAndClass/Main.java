package com.company.ObjectAndClass;
//Using Object Name
public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        //Initialize object values
        employee.name="Martin";
        employee.age=24;
        //Print values to check
        System.out.println(employee.name+" "+employee.age);
    }
}


class Employee{
    String name;
    int age;
}