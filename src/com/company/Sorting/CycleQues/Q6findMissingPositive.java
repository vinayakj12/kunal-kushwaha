package com.company.Sorting.CycleQues;

public class Q6findMissingPositive {

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        firstMissingPositive(nums);
    }

    static int firstMissingPositive(int[] arr) {

        int i = 0;

        while (i< arr.length)
        {
            int correct = arr[i]-1;
            if (arr[i] <= arr.length && arr[i] != arr[correct] && arr[i] > 0)
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
                return j+1;
            }
        }

        return arr.length + 1;


    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
