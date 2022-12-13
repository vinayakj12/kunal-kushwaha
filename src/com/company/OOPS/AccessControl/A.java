package com.company.OOPS.AccessControl;

public class A {

    // convention to not allow direct access to intenal variable
    private int num;
    String name;
    int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
