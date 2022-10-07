package com.company.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        for (int i = 0; i < arr.length-1; i++) {
            int lowestNumberIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[lowestNumberIndex]){
                    lowestNumberIndex = j;
                }
            }

            if (lowestNumberIndex!=i)
            {
                var temp = arr[i];
                arr[i] = arr[lowestNumberIndex];
                arr[lowestNumberIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
