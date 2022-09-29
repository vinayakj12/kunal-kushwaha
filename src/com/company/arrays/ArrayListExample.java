package com.company.arrays;

import java.util.ArrayList;
import java.util.Scanner;

// used for dynamic memory allocation
public class ArrayListExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);


        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // output

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
