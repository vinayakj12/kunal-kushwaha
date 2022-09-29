package com.company.LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumberDigits {

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));


    }
    static  int  findNumbers(int[] nums)
    {
        //METHOD 1   4ms
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(String.valueOf(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;

        // optimized solution submitted on leetcode
    }
}
