package com.company.Variables;

public class VariableDemo {
    //Instance
    //A variable declared at the class level but outside a method or a block is an Instance variable.
    int a;
    //Static variable
    //A variable that is declared as static and refers to shared property for all class objects is known as a Static variable.
    static int b=20;

    public void print(){
        //Local variable
        //A variable declared inside a method or a block is termed a Local Variable.
        int c=10;
        System.out.println("Method local variable: "+c);
    }

    public static void main(String[] args) {
        VariableDemo demo = new VariableDemo();
        System.out.println("Instance variable: "+demo.a);
        System.out.println("Static variable: "+b);
        demo.print();
    }
}
