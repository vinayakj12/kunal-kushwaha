package com.company.OOPS.staticExample;

public class StaticBlock {

    static int a = 4;
    static int b;

    // will only run once when first object is created i.e class is loaded
    static {
        // this is done to show initialization of static variables
        System.out.println("I am in static block");

        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
