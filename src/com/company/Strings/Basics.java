package com.company.Strings;

public class Basics {

    public static void main(String[] args) {
        String name = "Kunal Kushwaha";

        String a = "kunal";
        String b = "kunal";

        // * strings in java are stored in the heap memory in the
        // * place called string pool and for two same objects as
        // above the two reference variavle point to same object
        // no new object is created in the string pool that's why
        // they are stored in the string pool.
        // * strings are immutable it cannot be changed it creates new object


        // ? to create a new object with different value
        String name1 = new String("kunal");
        String name2 = new String("kunal");

        // ? to check the value is equal or not use .equals

        // ? to get character at particular index
        // name1.charAt(0)

    }
}
