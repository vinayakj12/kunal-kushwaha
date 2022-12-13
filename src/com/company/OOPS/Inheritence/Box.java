package com.company.OOPS.Inheritence;

public class Box {

    // every super class inherits the object class in java internally
    // super keyword is use to call the constructor of parent class
    double l;
    double h;
    double w;

    Box()
    {
        this.h= -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side)
    {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l,double h,double w)
    {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public void information()
    {
        System.out.println("Running the box");
    }




}
