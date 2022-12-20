package com.company.Recursion.Array;

import java.util.ArrayList;

public class SortedCheck {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr, int i)
    {
        if (i == arr.length-1)
            return true;

        // self work and recursive call
        // i will do for two values u give me the answer for rest of the array
        // && condition as all array elements should follow the order both condition should be true
        return arr[i] < arr[i+1] && sorted(arr,i+1);

    }

    static boolean linearSearch(int[] arr,int target, int i)
    {
        if (i == arr.length-1)
            return false;

        // self work and recursive call
        // i will do for two values u give me the answer for rest of the array
        // && condition as all array elements should follow the order both condition should be true
        return arr[i] < arr[i+1] || linearSearch(arr,target,i+1);

    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr,int target,int index)
    {
        if (index == arr.length)
        {
            return;
        }

        // self work
        if (arr[index] == target)
        {
            list.add(index);
        }
        // recursive call
        findAllIndex(arr,target,index + 1);
    }

    // return arraylist without passing arguments.
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    // approach the create new list in each function call .
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }





}
