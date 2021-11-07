package com.company.FinalKeyword;

public class FinalExample {
    //If you make any variable final then you are not allowed to change its value later.
    //It will be constant.If you try to change value, then compiler will give you error.
    final int count=10;

    //Blank final variable
    //Blank final variable is the variable which is not initialised at the time of declaration. It can be initialised only in constructor.
    //But if you do not initialise final variable, you will get compilation error
    final int count1;

    //You can initialize final variable once in a constructor as below.
    FinalExample(int count1)
    {
        this.count1=count1;
    }
    public static void main(String args[])
    {
        FinalExample fe=new FinalExample(20);
        System.out.println(fe.count1);
    }


}



