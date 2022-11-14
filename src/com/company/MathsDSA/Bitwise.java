package com.company.MathsDSA;

public class Bitwise {

    public static void main(String[] args) {

        int[] arr = {1,2,2,1,5,5,4,3,3};
        int ans = ans(arr);
        System.out.println(ans);
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for (int n: arr) {
            unique^=n;
        }
        return unique;
    }
}
