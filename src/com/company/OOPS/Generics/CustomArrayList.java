package com.company.OOPS.Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int SIZE = 0;

    public CustomArrayList()
    {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num)
    {
        if (isFull())
        {
            resize();
        }

        data[SIZE++] = num;

    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
        // temp will be destroyed as it's the scope variable data on the other hand it's the instance variabe and will be destroyed on dest of object

    }

    private boolean isFull()
    {
        return SIZE == data.length;
    }

    public int remove()
    {
        int removed = data[--SIZE];
        return removed;
    }

    public int get(int index)
    {
        return data[index];
    }

    public int size()
    {
        return SIZE;
    }

    public void set(int index, int value)
    {
        data[index] = value;
    }


    // Method overriding the default tostring method
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", SIZE=" + SIZE +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
    }
}
