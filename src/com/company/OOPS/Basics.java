package com.company.OOPS;

public class  Basics {
    public static void main(String[] args) {
        Student student1 = new Student(10,"vinayak",99);
        System.out.println(student1.name);
    }

}

class Student {
    int rno;
    String name;
    float marks;

    // ! for primitive data types works
    // final variable can't be modified is constant always have to be intialized
    final int designation = 10;

    // when a non primitive is final you can't reassign it 

    Student()
    {
        // call constructor from another constructor
        this (13,"vinayak",45);

        //Java constructors or constructors in Java is a terminology used to construct something in our programs. A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.
    }

    Student (int rno, String name, float marks)
    {
        // this is  reference for object
        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }
}


