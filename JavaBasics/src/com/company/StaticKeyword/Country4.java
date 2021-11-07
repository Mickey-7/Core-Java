package com.company.StaticKeyword;

public class Country4 {
    //Static class:
    //In java,you can define a class within another class.
    //Such a class is called a nested class.
    //The class which enclosed nested class is known as Outer class.
    //In java, we can’t make outer class static.
    //Only nested class can be declared as static

    static class InnerStaticClass{
        public void printInnerClass(){
            System.out.println("In inner class");
        }
    }

    public static void main(String[] args)
    {

        System.out.println("****************************************");
        Country4.InnerStaticClass inc=new Country4.InnerStaticClass();
        inc.printInnerClass();
        System.out.println("****************************************");
    }

}
