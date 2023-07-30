package com.company.Recursion.Level1;

public class Back1toN {

    static void Back(int i, int n)
    {
        if (i==1)
        {
            System.out.println(i);
            return;
        }

        Back(i-1,n);
        System.out.println(i);
    }

    static void RevArr(int[] arr, int start, int end)
    {
        if (start >= end)
        {
            return;
        }

        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

        RevArr(arr,start+1,end-1);
    }

    static void printArray(int arr[],
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

//        int n =5;
//        Back(n,n);

        int[] arr = {1,2,3,4,5};
        RevArr(arr,0, arr.length-1);
        printArray(arr, arr.length);
    }
}
