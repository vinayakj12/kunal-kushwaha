package com.company.Recursion.Level1;

public class Q1Nto1 {

    public static void main(String[] args) {
        int n = 123;

        System.out.println(ReverseDigits(n));
    }

    private static int ReverseDigits(int n) {
        if (n%10==0)
        {
            return n;
        }

        return (n%10)+ ReverseDigits(n/10)  ;
    }

    private static int SumOfDigits(int n) {

        if(n==0)
        {
             return 0;
        }
        return n%10 + SumOfDigits(n/10);


    }

    private static int sum(int n) {
        if (n==1)
        {
            return 1;
        }

        return n + sum(n-1);
    }

    private static int fact(int n) {

        if (n==1)
        {
            return 1;
        }

        return n * fact(n-1);
    }

    private static void fun(int n) {

        if (n==0)
        {
            return;
        }

        fun(n-1);
        System.out.println(n);
    }


}
