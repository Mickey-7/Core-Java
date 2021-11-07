package com.company.AccessModifiers.Default;

//If you do not provide any access, JVM considers it as default access.
//In the case of default access modifier, you can not access method, variable or class outside of the package.
public class A {

    int a;

    public A(int a)
    {
        this.a=a;
    }
    void methodA()
    {
        System.out.println("In method of class A");
    }
}

class B {

    public static void main(String args[])
    {
        A objA=new A(20);
        objA.methodA();
        System.out.println("Value of variable a is: "+objA.a);
    }
}