package com.company.StaticKeyword;

public class Country {

    //static variable
    //If any instance variable is declared as static.It is known as static variable.
    static int countryCounter;

    // instance variable
    String name;
    int dummyCounter;
    Country(String name){
        this.name=name;
        countryCounter++;
        dummyCounter++;
    }

    public static void main(String[] args)
    {
        System.out.println("****************************************");

        Country india=new Country("India");
        System.out.println("Country Name: "+india.getName());
        System.out.println("Number of country object created: "+Country.countryCounter);
        System.out.println("Dummy counter not a static variable: "+india.dummyCounter);
        System.out.println("****************************************");
        Country france=new Country("France");
        System.out.println("Country Name: "+france.getName());
        System.out.println("Number of country object created: "+france.countryCounter);
        System.out.println("Dummy counter not a static variable: "+france.dummyCounter);

        System.out.println("****************************************");

        //In above example,we have one static variable named “countryCounter” so whenever we are creating one new object,
        //its value will be incremented by 1 as counterCounter variable is being shared by all country objects and
        //we have instance variable named “dummyCounter” so whenever any new object is created,
        // its value is initialized to 0 again.

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
