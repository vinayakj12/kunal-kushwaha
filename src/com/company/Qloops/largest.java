package com.company.Qloops;

import java.util.Scanner;

public class largest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Boka approach

//        if(a>b){
//            if(a>c){
//                System.out.println("a is largest");
//
//            }
//            else {
//                System.out.println("c is largest");
//            }
//        }
//        else if(b>c){
//            System.out.println("b is largest");
//
//        }
//        else{
//            System.out.println("c is largest");
//        }

        // opimal

        int max = a;
        if(b> max) max = b;
        if(c > max) max = c;
        System.out.println(max);
    }
}
