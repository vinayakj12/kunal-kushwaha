package com.company.BinarySearch.Questions;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class CeilingOfNumber {

    public static void main(String[] args) {

        int[] arr = {2,3,5,8,14,16};
        int target = 8;
        binarySearch(arr,target);

    }

    static void binarySearch(int[] arr, int target)
    {

        int start = 0;
        int end = arr.length -1;
        if (target > arr[end]){ // case where the target is greater than the largest element in array
            System.out.println("-1");
        }

        while(start<=end)
        {
            //int mid = (start+end)/2; // it may exceed the limit of integers
            int mid;
            mid = start + (end - start)/2; // optimization
            System.out.println(mid);

            if(target < arr[mid])
                end = mid - 1;
            else
            {
                start = mid + 1;
            }

        }
        System.out.println(arr[start%arr.length]);
    }
}
// Method 2
class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        for (char c: letters)
            if (c > target) return c;
        return letters[0];
    }
}
