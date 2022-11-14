package com.company.funcMeth;

public class FunQ {

    public static void main(String[] args) {
        System.out.println(prime(45));

    }

    static boolean prime(int n)
    {
        int c = 2;
        if(n<=1) return false;
        while(c*c <= n){

            if (n%c == 0) return false;
            c++;
        }

        return true;
    }


}
