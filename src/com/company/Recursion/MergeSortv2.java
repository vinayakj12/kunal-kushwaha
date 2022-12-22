package com.company.Recursion;

import java.util.Arrays;

public class MergeSortv2 {
    public static void main(String[] args) {


        int[] arr = {5,4,3,2,1};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    // new arrays are created in this approach original orray is not being modified

    static void mergeSort(int[] arr,int s,int e)
    {
        if (e-s == 1)
        {
            return;
        }

        int mid = (s + e)/ 2;

        // left part
        mergeSort(arr,s,mid);
        // right part
        mergeSort(arr,mid,e);

        // merge part in place
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr,int s,int m,int e) {

        // size for the merge array
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i< m && j < e)
        {
            if (arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // to add the remaining elements of the array in merge process
        // copy the remaining elements
        while (i < m)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // for changing the original array in place
        for (int l = 0; l < mix.length; l++)
        {
            arr[s+l] = mix[l];
        }

    }


}
