package com.company.LinearSearch;

public class SearchInStrings {

    public static void main(String[] args) {
            String name = "Kunal";
            char target = 'u';
            System.out.println(search(name,target));

    }

    static boolean search(String str, char target)
    {
        if (str.length()==0)
        {
            return false;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (target==str.charAt(i)){
//                return true;
//            }
//        }

        // using For each loop
        for(char ch: str.toCharArray())
        {
            if (ch == target)
            {
                return true;
            }
        }
        return false;
    }
}
