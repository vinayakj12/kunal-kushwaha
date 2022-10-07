package com.company.Sorting;

// * Also known as sinking sort and exchange sort

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        boolean sorted = false;
        int unsorted_index = arr.length-1;
        int temp = 0;
        int time_complexity = 0;

        // if not using the boolean use the index till n-1 times for n elements
        while(!sorted)
        {
           sorted = true;
            for (int i = 0; i < unsorted_index; i++) {
                time_complexity += 1;
                if (arr[i]> arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
            unsorted_index -= 1;
        }
//        for (int nums:arr
//             ) {
//            System.out.println(nums);
//        }

        System.out.println(Arrays.toString(arr));
        System.out.println(time_complexity);

    }

}
