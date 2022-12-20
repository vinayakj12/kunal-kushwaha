package com.company.Recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr= {6,5,4,3,2};
        //selectionSort(arr,0, arr.length-1,arr.length-1);
        //sort(arr,0, arr.length-1);
        selectionSort(arr,0, arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr, int i,int n)
    {
        if (n==0)
            return ;


        if (i< n) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
            sort(arr, i + 1, n);

        }

        sort(arr, 0, n-1);
    }

    static void selectionSort(int[] arr, int i,int n,int max) {
        if (n == 0)
            return;
        if (i < n) {
            if (arr[i] > arr[max]) {
                max = i;

            }
            selectionSort(arr, i + 1, n, max);
        } else {
                if (arr[max] != arr[n])
                {
                    var temp = arr[n];
                    arr[n] = arr[max];
                    arr[max] = temp;
                }
                selectionSort(arr, 0, n-1,n-1);
            }
        }

    static void selectionSortv2(int[] arr, int i,int n,int max) {
        if (n == 0)
            return;
        if (i < n) {
            if (arr[i] > arr[max]) {
                selectionSortv2(arr, i + 1, n, max);

            }
            selectionSortv2(arr, i + 1, n, max);
        } else {
                var temp = arr[n];
                arr[n] = arr[max];
                arr[max] = temp;
            selectionSortv2(arr, 0, n-1,0);
        }
    }



}
