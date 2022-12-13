package com.company.OOPS.staticExample;

public class InnerClasses {

    // Outside class cannot be static
    // static stuffs are resolved during compile time
    // as you declare inner class static now it's not dependent on outside class object
   static class Test {
       String name;
       public Test (String name)
       {
           this.name = name;
       }


    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("vinayak");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
