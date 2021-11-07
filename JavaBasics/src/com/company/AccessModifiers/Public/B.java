package com.company.AccessModifiers.Public;


//Public modifier is accessible in the whole java world.
//If you put class as the public that means that class is available everywhere.
public class B {
    public static void main(String[] args) {
        A objA = new A(20);
        objA.methodA();
        System.out.println("Value of a is: "+objA.a);
    }
}
