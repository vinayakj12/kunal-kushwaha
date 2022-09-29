package com.company.BinarySearch.Questions;
//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {

    public static void main(String[] args) {
        int start = 0;
        int[] arr = {0,1,2,4,2,1};
        int end = peakIndexInMountainArray(arr);
        int target = 3;
        int index = binarySearch(arr,target,start,end);
        if (index == -1)
        {
            index = binarySearch(arr,target,end,arr.length-1);
        }
        System.out.println(index);

    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length -1;

        while(start < end)
        {

            int mid;
            mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){

                end = mid;
            }
            else
            {

                start = mid + 1;

            }

        }
//        return ans;
        return start;

    }

    static int binarySearch(int[] arr, int target, int start,int end)
    {


        boolean isAsc = arr[start] < arr[end]; // check for order is ascending or descending.

        while(start<=end)
        {
            //int mid = (start+end)/2; // it may exceed the limit of integers
            int mid;
            mid = start + (end - start)/2; // optimization

            if (arr[mid] == target)
            {
                return mid;
            }

            if (isAsc)
            {
                if(target < arr[mid])
                    end = mid - 1;
                else
                {
                    start = mid + 1;
                }

            }
            else {
                if(target > start)
                {
                    return -1;
                }

                if(target < arr[mid])
                    start = mid + 1;
                else
                {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }

}
