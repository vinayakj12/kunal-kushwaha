package com.company.BinarySearch.Questions;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndex {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,4,3,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }

    public static int peakIndexInMountainArray(int[] arr) {
//        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while(start < end)
        {

            int mid;
            mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                // you are in dec part of the array
                // this may be the ans, but look at left
                // this is why end != mid -1
//                ans =  mid;
                end = mid;
            }
            else
            {
                // you are in asc part of the array
                start = mid + 1;
                // in the end, start == end and pointing to the largest number because of the 2 checks above
                // start and end are always trying to find max element in the above 2 checks
                // hence, when they are pointing to just one element, that is the max one because that is what the checks say
                // more elaboration: at every point of time for start and end, they have the best possible answer till that time
                // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
            }

        }
//        return ans;
        return start;
    }

}
