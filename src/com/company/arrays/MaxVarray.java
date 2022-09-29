package com.company.arrays;

public class MaxVarray {


    public static void main(String[] args) {
        int[] arr = {1,2,23,9,18};
        System.out.println(max(arr));
    }
    static  int max(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

}
