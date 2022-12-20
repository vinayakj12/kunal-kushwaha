package com.company.Recursion.Array;

public class RBS {

    public static void main(String[] args) {

    }

    static int rbs(int[] arr, int target, int start, int end)
    {
        if (start > end)
        {
            return -1;
        }

        int m = start + (end - start)/2;
        if (arr[m] == target)
            return m;

        if (arr[start] <= arr[m])
        {
            if (target <= arr[start] && target>= arr[m])
                return rbs(arr, target, start, m - 1);
            else return rbs(arr, target, m + 1, end);

        }

        if (target >= arr[m] && target <= arr[end])
            return rbs(arr, target, m + 1, end);
        return rbs(arr, target, start, m-1);
    }
}
