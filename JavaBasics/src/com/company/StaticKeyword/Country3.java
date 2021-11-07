package com.company.StaticKeyword;

public class Country3 {
    //Static block
    //Block of statement inside a Java class that will be executed when a class is first loaded in to the JVM
    static{
        System.out.println("This block will get call before main method");
    }

    public static void main(String[] args) {

        System.out.println("In main method");
    }
}
