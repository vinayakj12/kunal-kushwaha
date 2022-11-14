package com.company.Sorting.CycleQues;
// https://leetcode.com/problems/set-mismatch/
public class Q5finsErrorNums {

    public static void main(String[] args) {
        int[] nums = {};
        findErrorNums(nums);
    }

    static int[] findErrorNums(int[] arr) {

        int i = 0;

        while (i< arr.length)
        {
            int correct = arr[i]-1;
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
            if (arr[j] != j+1)
            {
                return new int[]{arr[j],j+1};
            }
        }

        return new int[]{-1,-1};


    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
    }

