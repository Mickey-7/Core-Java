package com.company.StaticKeyword;

public class Country1 {
    String name;
    static int countryCounter;
    int dummyCounter;
    Country1(String name)
    {
        this.name=name;
        countryCounter++;

        dummyCounter++;
    }


    public static void main(String[] args)
    {
        Country india=new Country("India");

        System.out.println("****************************************");
        System.out.println("Country Name: "+india.getName());
        printCountryCounter();
        System.out.println("Dummy counter not a static variable: "+india.dummyCounter);
        System.out.println("****************************************");
        Country france=new Country("France");
        System.out.println("Country Name: "+france.getName());
        printCountryCounter();
        System.out.println("Dummy counter not a static variable: "+france.dummyCounter);
        System.out.println("****************************************");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Static Method:
    //If any method is declared as static.It is known as static method.
    public static void printCountryCounter()
    {
        System.out.println("Number of country object created: "+countryCounter);
    }
}
