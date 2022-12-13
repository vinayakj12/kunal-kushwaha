package com.company.OOPS.staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;

    static long population; // props that are not related to object but are common to all.
    //* static variables are not dependent on the object

    // * static in main method to acces it without creating the object of the class.
    // we should be able to run main without creating the object as main is the first thing rum in class.
    // static method or variable belong to the class.

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
