package com.company.Sorting.CycleQues;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/
public class Q1missingNumber {

    public static void main(String[] args) {
        int[] nums = {4,0,2,1};
        System.out.println(missingNumber(nums));


    }

    static int missingNumber(int[] arr) {
        int i = 0;

        while (i< arr.length)
        {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }

        // search for missing element
        for (int j = 0; j < arr.length;j++) {
            if (arr[j] != j)
            {
                return j;
            }
        }

        return arr.length;


    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
