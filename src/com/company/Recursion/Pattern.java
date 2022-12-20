package com.company.Recursion;

public class Pattern {
    public static void main(String[] args) {
        pattern1(5,0);
    }


    static void pattern1(int n, int i)
    {
        if (n==0)
        {
            return;
        }

        if (i<n)
        {
            System.out.print("*");
            pattern1(n,i+1);
        }else
        {
            System.out.println();
            pattern1(n-1,0);
        }

    }
}
