package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {

        int arr[][] = new int[2][2];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

/*
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");;
            }
        }
*/

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
