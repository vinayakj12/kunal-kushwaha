package com.company.BinarySearch.Questions;

public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};

        int ans = findPivot(arr);
        System.out.println(ans  + 1);
    }

    static int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length -1;

        while(start <= end)
        {

            int mid;
            mid = start + (end - start)/2;
            // ! for index bound error adding mid < end condition with &&
            if(mid < end && nums[mid] > nums[mid+1]){


                return mid;
            }
            else if ( mid > start && nums[mid] < nums[mid -1 ])
            {


                return mid-1;

            }
            else if (nums[start] > nums[mid])
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
    }

