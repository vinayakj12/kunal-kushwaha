package com.company.HashingAC.Ques;

// Given an integer of size n, find all the elements that appear more than n/3 times

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MajorityElement {

    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        itenaryTickets();
    }

    static void MajorityElement(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1 );
            }
        }

        for (int key: map.keySet())
        {
            if (map.get(key) > nums.length/3)
            {
                System.out.println(key + " " + map.get(key));
            }

        }
    }

    static void unionOfSet(int[] arr1,int[] arr2)
    {
        int n = Math.min(arr1.length, arr2.length);

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {

            set.add(arr1[i]);
            set.add(arr2[i]);
        }
            if (arr1.length < arr2.length)
            {
                for (int i = n; i < arr2.length; i++) {
                    set.add(arr2[i]);
                }
            }
            else {
                for (int i = n; i < arr1.length; i++) {
                    set.add(arr1[i]);
                }
            }

        System.out.println(set);

//        Iterator it = set.iterator();
//
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }
    }

    static void intersection(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i]))
            {
                System.out.println(arr2[i]);
                count += 1;
                set.remove(arr2[i]);
            }
        }

        System.out.println("The count for the matched element is:- "+count);
    }

    static void itenaryTickets ()
    {
        HashMap<String,String> set = new HashMap<>();
        set.put("Chennai", "Bengaluru");
        set.put("Mumbai", "Delhi");
        set.put("Goa", "Chennai");
        set.put("Delhi", "Goa");

        HashMap<String,String> rev = new HashMap<>();
        for (String key: set.keySet()) {
            rev.put(set.get(key),key);
        }

        String start = null;
        for (String key: set.keySet()) {
            if (!rev.containsKey(key))
            {
                start = key;
            }
        }

        while (set.containsKey(start))
        {
            System.out.println(start);
            start = set.get(start);
        }

        System.out.println(start);



    }

}
