package com.company.OOPS.Generics;

import java.util.Arrays;

// generic allow u to type template for class to use multiple data type for single code.
public class CustomGenericArrayList<t> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int SIZE = 0;

    public CustomGenericArrayList()
    {
        data = new Object[DEFAULT_SIZE];
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
        Object[] temp = new Object[data.length * 2];
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

    public t remove()
    {
        t removed = (t)data[--SIZE];
        return removed;
    }

    public t get(int index)
    {
        return (t) data[index];
    }

    public int size()
    {
        return SIZE;
    }

    public void set(int index, t value)
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

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList();
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
    }
}
