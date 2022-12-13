package com.company.OOPS.Abstraction;

public abstract class Parent {
    int age;
    final int value;
    static int id;

    Parent(int age){
        this.age = age;
        value = 1212;
    }


    abstract void career(String name);

    abstract void partner(String name, int Age);

    static void hello()
    {
        System.out.println("hey");
    }


    // you cannot create object of the abstract class
    // cannot create abstract constructors and static abstract methods as static methods cannot be overriden but can create static methods as static do not depend on objects and abstract classes object cannot be created.

    // you cannot create abstract objects but use as refernece variable in object creation of subclass
    Parent obj = new Son(34);

    // an abstract class cannot be final
}
