package com.company.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        for (int i = 0; i <arr.length -1 ; i++) {

            for (int j = i+1; j >0 ; j--) {
                 if (arr[j] < arr[j-1])
                 {
                     swap(arr,j,j-1);
                 }
                 else{
                     break;
                 }
            }

        }


        //! METHOD TWO
//        for (int i = 1; i < arr.length; i++) {
//            var temp = arr[i];
//            var position = i-1;
//
//            while (position >=0)
//            {
//                if (arr[position] > temp)
//                {
//                    arr[position+ 1] = arr[position];
//                    position -= 1;
//                }
//                else {
//                    break;
//                }
//
//            }
//            arr[position+1] = temp;
//        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int j, int i) {

        var temp = arr[j];
        arr[j] = arr[i];
        arr[i]= temp;
    }
}
