package com.company.MathsDSA;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (var i = 1; i < n; i++) {
            for (int j = 1; j <= 10; j++) System.out.println(i + " * " + j + " = " + i * j);
            System.out.println("----xxx----");

        }

    }
}
