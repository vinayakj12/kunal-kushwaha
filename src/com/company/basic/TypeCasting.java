package com.company.basic;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);



        // type conversion occurs between the lower value type to higher value

        // type casting
        int num = (int) (67.45f);
        System.out.println(num);


        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); // maximum value in byte 256   257%256 = 1
//        System.out.println(b);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a*b / c ; // automatic promotion to int for intermediate results

    }
}
