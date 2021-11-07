package com.company.AccessModifiers.Private;

//The private access modifier is accessible only within class.
//You can not use private and protected with class unless and until it is nested class.
public class A {
    private int a;
    A(int a){
        this.a = a;
    }
    private void methodA(){
        System.out.println("In method of class A");
    }

    static class B{
        public static void main(String[] args) {
            A objA=new A(20);
            objA.methodA();
            System.out.println("Value of variable a is: "+objA.a);
        }
    }
}


