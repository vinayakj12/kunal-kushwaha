package com.company.funcMeth;

public class FunQ {

    public static void main(String[] args) {

    }

    static boolean prime(int n)
    {
        int c = 2;
        if(n<=1) return false;
        while(c*c <= n){

            if (n%c == 0) return false;
            c++;
        }

        return c*c > n;
    }


}
