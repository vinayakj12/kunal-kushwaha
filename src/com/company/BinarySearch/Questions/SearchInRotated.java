package com.company.BinarySearch.Questions;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchInRotated {

    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 0;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int pivot = peakIndexInMountainArray(nums);
//        int index = binarySearch(nums,target,0,pivot);
//        if (index == -1)
//        {
//            index = binarySearch(nums,target,pivot+1,nums.length-1);
//        }
//        return index;

        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);



    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length -1;


        while(start < end)
        {

            int mid;
            mid = start + (end - start)/2;
            // ! for index bound error adding mid < end condition with &&
            if(mid < end && arr[mid] > arr[mid+1]){


                return mid;
            }
            else if ( mid > start && arr[mid] < arr[mid -1 ])
            {


                return mid-1;

            }
            else if (arr[start] >= arr[mid])
            {
                end = mid -1;
            }
            else
            {
                start = mid + 1;
            }

        }
//        return ans;
        return -1;

    }

    static int binarySearch(int[] arr, int target,int start,int end)
    {


        while(start<=end)
        {
            //int mid = (start+end)/2; // it may exceed the limit of integers
            int mid;
            mid = start + (end - start)/2; // optimization

            if(target < arr[mid])
                end = mid - 1;
            else if (target>arr[mid])
            {
                start = mid + 1;
            } else return mid;

        }
        return -1;
    }
}


// ? SEARCH IN ROTATED SORTED ARRAY WITHOUT USING THE PIVOT CONCEPT

class OnlyBinarySearch
{
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {

            int start = 0;
            int end = nums.length -1;


            while (start <= end)
            {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target)
                {
                    return mid;
                }
                // Left half is sorted and contains the mid value the max element
                if (nums[mid] > nums[start])
                {
                    if ( target < nums[mid]&& nums[mid] >= nums[start])
                    {
                        end = mid;
                    }
                    else {
                        start = mid + 1;
                    }
                }
                else {
                    if ( target > nums[mid]&& nums[mid] < nums[start])
                    {
                        start = mid + 1;
                    }
                    else {
                        end = mid;
                    }

                }




            }
            return -1;
    }
}

