package com.company.OOPS;

public class Lambdafunctions {





    public static void main(String[] args) {
        Operation sum;
        sum = ((a, b) -> a+b);
        Operation mul = ((a, b) -> a*b);
        Operation sub = ((a, b) -> a-b);
        Lambdafunctions myCalculation = new Lambdafunctions();
        System.out.println(myCalculation.operate(4,5,sum));
    }
    private int operate(int a, int b, Operation op)
    {
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a, int b);
}
