package com.company.Qloops;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        // For equals functions compare only value for string object not reference i.e done by ==;
//        String a = "vinayak";
//
//        if(a.equals("vinayak")){
//            System.out.println("compare by value ");
//        }
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
//
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }
        // new style no break statement required
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
