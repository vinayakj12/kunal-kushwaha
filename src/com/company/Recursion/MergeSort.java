package com.company.Recursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {


        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // new arrays are created in this approach original orray is not being modified

    static int[] mergeSort(int[] arr)
    {
        if (arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {

        // size for the merge array
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< first.length && j < second.length)
        {
            if (first[i] < second[j])
            {
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // to add the remaining elements of the array in merge process
        // copy the remaining elements
        while (i < first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }




}

