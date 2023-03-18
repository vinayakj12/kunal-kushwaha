package com.company.StackQueue;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack()
    {
        // calling another constructor from constructor
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size)
    {
        this.data = new int[size];
    }

    // insertion
    public boolean push(int item)
    {
        if (isFull())
        {
            System.out.println("Stack is full ");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    private boolean isEmpty()
    {
        return ptr == -1;
    }

    public int pop() throws StackException
    {
        if (isEmpty())
        {
            throw new StackException("cannot pop from an empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peak() throws StackException
    {
        if (isEmpty())
        {
            throw new StackException("cannot peak from an empty stack");
        }

        return data[ptr];
    }


}
