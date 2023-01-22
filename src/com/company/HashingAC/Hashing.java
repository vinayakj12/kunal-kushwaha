package com.company.HashingAC;

import java.util.*;

public class Hashing {

    public static void main(String[] args) {

    hashMap();

    }

    static void hashSet()
    {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        if (set.contains(1))
        {
            System.out.println("element found");
        }

        System.out.println(set);

        // iterator set has no index
        Iterator it = set.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    static void hashMap()
    {
        HashMap<String,Integer> map = new HashMap<>();

        // insertion

        map.put("India", 120);
        map.put("Us", 30);
        map.put("china",150);

        System.out.println(map);

        // search
        if (map.containsKey("china"))
        {
            System.out.println("Element found");
        }

        // get key value
        System.out.println(map.get("china"));


        // for each
//        for (int val: arr) {
//
//        }
        for (Map.Entry<String , Integer> e : map.entrySet())
        {
            // printing the key values
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key: keys)
        {
            System.out.println(key + " " + map.get(key));
        }


    }
}
