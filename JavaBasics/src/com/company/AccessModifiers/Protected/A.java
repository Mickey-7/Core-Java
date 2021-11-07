package com.company.AccessModifiers.Protected;
//Protected access modifiers can be accessed within the same package or outside the package by inheritance only.
public class A {
    protected int a;

    protected A(int a)
    {
        this.a=a;
    }
    protected void methodA()
    {
        System.out.println("In method of class A");
    }
}
