package com.company.OOPS.Interfaces;

public class A {

    // nested interface can be declare public,private and protected and top level interface can be public and default one.
    public interface NestedInterface
    {
        boolean isOdd(int num);
    }

}

class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(4));
    }
}


