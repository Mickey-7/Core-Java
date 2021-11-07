package com.company.FinalKeyword;

//You can not override final methods in subclasses.
//You can call parent’s class final method using subclass’s object but you can not override it.
public class Rectangle extends Shape{

    public static void main(String args[])
    {
        Rectangle rectangle= new Rectangle();
        rectangle.draw();
    }
}

class Shape{
    //Final method
    public final void draw()
    {
        System.out.println("Draw method in shape class");
    }
}
