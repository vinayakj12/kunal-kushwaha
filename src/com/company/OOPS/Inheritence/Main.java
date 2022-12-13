package com.company.OOPS.Inheritence;

public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        BoxWeight box1 = new BoxWeight();
        // super not created default base class constructor is used
        System.out.println(box1.l + " " + box1.h);

        // ! error the obj itself is of type parent class how it will call the constructor of child class
//        BoxWeight box2 = new Box(2,3,4);
        // parent class does not have idea of child class hence an error
    }
}
