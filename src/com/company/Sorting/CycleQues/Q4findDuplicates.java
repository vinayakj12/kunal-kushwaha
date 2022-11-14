package com.company.Sorting.CycleQues;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4findDuplicates {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(Arrays.toString(findDuplicates(nums)));

    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length)
        {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (j+1 != nums[j])
            {
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
