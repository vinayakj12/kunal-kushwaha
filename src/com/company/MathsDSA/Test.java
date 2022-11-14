package com.company.MathsDSA;

public class Test {
    public static void main(String[] args) {

        int n = 6;
        System.out.println(n&-n);// position of rightmost bit
        boolean ans = (n & (n-1)) == 0; // to check if it is power of two or not

        System.out.println(ans);
    }
}
