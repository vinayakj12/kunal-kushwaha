package com.company.Qloops;

import java.util.Scanner;

// finding the occurence of the a single digit in number
public class NumOccur {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        System.out.println("Enter the key");
        int key = in.nextInt();
        int count = 0;
        while(n>0)
        {
            int temp = n % 10;
            if(temp == key){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
