package com.company.Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int ans = bS(arr,0,arr.length-1,4);
        System.out.println(ans);
    }

    static int bS(int[] arr,int start,int end,int target)
    {
        if (start > end)
        {
            return -1;
        }

        int mid = (start + end)/2;

        if (target == arr[mid])
        {
            return mid;
        }
        if (target < arr[mid])
        {
            return bS(arr,start,mid-1,target);
        }

        return bS(arr,mid+1,end,target);
    }

}
