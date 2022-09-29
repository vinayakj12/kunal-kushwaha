package com.company.BinarySearch;

public class OrderAgnBs {

    // Order agnostic binary search in which we don't know the order of the array whether it is ascending or descending.

    public static void main(String[] args) {
        int[] arr = {4,2,1};
        int target = 3;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;

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
