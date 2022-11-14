package com.company.Sorting;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        int i = 0;

        while (i< arr.length)
        {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
