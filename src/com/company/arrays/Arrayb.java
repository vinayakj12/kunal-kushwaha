package com.company.arrays;

import java.util.Scanner;

public class Arrayb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[5];
        //Then, We create a Pointing element or simply called Reference variable which simply points out the Object(the created space in a Heap Memory)
        // reference variable point to refernce(alias name) to object(value)

        // input
        System.out.println("Enter the elements:");
        for (int i = 0; i<a.length;i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("Elements of the array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
