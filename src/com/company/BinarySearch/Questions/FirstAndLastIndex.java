package com.company.BinarySearch.Questions;

import java.util.Arrays;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastIndex {

    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }

    static public int[] searchRange(int[] nums, int target)
    {
        int[] ans = {-1,-1};
        // * Running the bs two times for getting the first and last index
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }


    // * For returning the first and last index using the boolean firstStartIndex

    static int search(int[] nums, int target, boolean firstStartIndex)

    {   int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start<=end)
        {
            //int mid = (start+end)/2; // it may exceed the limit of integers
            int mid;
            mid = start + (end - start)/2; // optimization

            if(target <nums[mid])
                end = mid - 1;
            else if (target>nums[mid])
            {
                start = mid + 1;
            } else
            {
                ans = mid;
                if (firstStartIndex)
                    end = mid - 1;
                else start = mid + 1;
            }

        }
        return ans;

    }


}
