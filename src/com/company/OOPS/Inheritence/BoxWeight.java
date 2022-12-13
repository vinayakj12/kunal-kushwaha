package com.company.OOPS.Inheritence;

public class BoxWeight extends Box {

    double weight;

    BoxWeight()
    {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // to get values from the parent CLASS constructor
        // used to initialize values present in parent class
        this.weight = weight;

        // inherited class cannot access the private values of parent class


    }
}
