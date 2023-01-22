package com.company.MathsDSA;

public class TrailingZero {

    public static void main(String[] args) {

        int n = 5;

        int res = 0;
        System.out.println(n/5);
        for (int i = 5; i <= n; i*=5) {
            res = res + n/i;
        }

        System.out.println(res);
    }
}
