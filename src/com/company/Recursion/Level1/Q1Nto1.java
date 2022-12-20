package com.company.Recursion.Level1;

public class Q1Nto1 {

    public static void main(String[] args) {
        int n = 1245;


        System.out.println(rev2(n));
    }

    static int sum = 0;
    private static void ReverseDigits(int n) {
        if (n%10==0)
        {
            return;
        }

        int rem =  (n%10);
        sum = sum* 10 + rem;
        ReverseDigits(n/10);
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

        if (n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);

    }

    static int a = 3;
    private static int AraiseToB(int b)
    {
        if (b==1)
        {
            return a;
        }
       return a * AraiseToB(b-1);
    }

    private static int powerRecursive(int a,int b)
    {
        //* base case
        if (b==0) return 1;
        if (b==1) return a;

        // * recursive assumption
        int temp = powerRecursive(a,b/2);

        // * self work
        if (b%2 == 0)
        {
            return temp * temp;
        }
        else return a * temp * temp;
    }

    private static int rev2(int n)
    {
        int digits = (int)(Math.log10(n));
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n==0) return n;
        return n%10 * (int)Math.pow(10,digits)+ helper(n/10,digits-1);

    }

    private static int count(int n, int c)
    {
        if (n==0)
        {
            return c;
        }
        int rem = n%10;
        if (rem==0)
        {
            return count(n/10,c+1);
        }
        return count(n/10,c);
    }
 

}
