package com.company.MathsDSA;

public class patterns {


    public static void main(String[] args) {
    
        int n = 5;
        pattern31(n);

    }

    static void pattern1(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }


    static void pattern2(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern3(int n)
    {
        for (int i = 1; i <= n; i++)  {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();

        }
    }

    // Left traingle pattern
    static void pattern4(int n)
    {

        for (int i = 1; i<2*n; i++) {

            int ColumnNumber = i>n? 2*n - i:i;
//            if (i>n)
//            {
//               ColumnNumber = 2*n - i;
//            }
//            else{
//                 ColumnNumber = i;
//            }
            for (int j = 1; j <= ColumnNumber; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // Kaju katli pattern

    static void pattern28(int n)
    {

        for (int i = 1; i<2*n; i++) {

            int ColumnNumber = i>n? 2*n - i:i;

            int noOfSpaces = n - ColumnNumber;
            for (int s = 1; s<=noOfSpaces; s++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= ColumnNumber; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern30(int n)
    {

        for (int i = 1; i<=n; i++) {

            for (int s = 1; s <=n - i; s++)
            {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    static void pattern17(int n)
    {

        for (int i = 1; i<2*n; i++) {

            int NumberOfColumns = i > n ? 2*n - i : i;
            for (int s = 0; s <n - NumberOfColumns; s++)
            {
                System.out.print(" ");
            }

            for (int j = NumberOfColumns; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= NumberOfColumns; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    static void pattern31(int n)
    {
        for (int i = 0; i <= 2*n; i++)
        {
            for (int j = 0; j <= 2*n; j++) {
                int atEveryIndex = n-Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j));
                System.out.print(atEveryIndex);
            }

            System.out.println();

        }
    }





}
