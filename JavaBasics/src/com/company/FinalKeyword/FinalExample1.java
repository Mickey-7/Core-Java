package com.company.FinalKeyword;

public class FinalExample1 {
    //static blank final variable
    //static blank final variable is static variable which is not initialized at the time of declaration.
    //It can be initialized only in static block.
    static final int count2;

    static
    {
        count2=10;
    }
    public static void main(String args[])
    {
        System.out.println(FinalExample1.count2);
    }
}
