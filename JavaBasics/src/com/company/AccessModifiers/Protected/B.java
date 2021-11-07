package com.company.AccessModifiers.Protected;

public class B extends A{
    protected B(int a) {
        super(a);
    }


    public static void main(String args[])
    {
        B ObjB=new B(20);
        ObjB.methodA();
        System.out.println("Value of variable a is: "+ObjB.a);
    }
}
