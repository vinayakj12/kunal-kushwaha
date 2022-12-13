package com.company.OOPS.Abstraction;

public class Son extends Parent{

    Son(int age) {
        super(age);
    }

    //    Son(int age)
//    {
//        this.age = age;
//    }
    @Override
    void career(String name) {
        System.out.println("I am going to be " + name);
    }

    @Override
    void partner(String name, int Age) {
        System.out.println("I LOVE " + name + "his age is " + Age);
    }
}
