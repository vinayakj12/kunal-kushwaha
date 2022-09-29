package com.company.BinarySearch.Questions;
// ! Q Find element in an infinite array GFG
public class InfinteArray {

    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target)
    {
        // first find the range
        // * first start with a box of size 2 and increase exponential
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        // * target should be less than {end} for lying in that region it should be in that region.
        // it will be always in that range
        // while it is greater than end keep doubling the box
        // ! LOOP WILL RUN UNTILL IT FINDS THE RANGE IN WHICH THE ELEMENT LIES
        while (target>arr[end])
        {
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeofbox * 2
            end = end + (end- start+1) * 2; // ! here we have to use old start for calculation.
            start = newStart;

        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start,int end)
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
