package com.company.Qloops;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int i = 1;
        while(i <= n)
        {
//            System.out.println(n1);
            int nth = n1 + n2;
            n1 = n2;
            n2 = nth;
            i++;
        }
        System.out.println(n1);
    }
}
