package com.company.StackQueue;

// Queue implementation with single pointer
public class CustomQueue {

    int[] data;
    int end = 0;
    private static final int DEFAULT_SIZE = 3;
    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size)
    {
        this.data = new int[size];
    }

    public boolean isFull()
    {
        return end == data.length;
    }

    public boolean isEmpty()
    {
        return end == 0;
    }

    public boolean insert (int item)
    {
        if (isFull())
        {
            return false;
        }

        data[end++] = item;
        return true;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
    }
    
}




