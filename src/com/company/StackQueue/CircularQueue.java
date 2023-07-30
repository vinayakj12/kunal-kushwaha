package com.company.StackQueue;

public class CircularQueue {

    protected int[] data;
    protected int end,front,size = 0;
    private static int DEFAULT_SIZE = 5;

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }

    public boolean isFull()
    {
        return size == data.length;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    // ! insertion
    public boolean insert (int item)
    {
        if (isFull())
        {
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    // ! Deletion
    public int removed() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Queue is Empty");
        }

        // Not required to shift elements.
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    // ! peek
    public int front() throws Exception
    {
        if (isEmpty()) {

            throw new Exception("Queue is empty");
        }

        return data[front];
    }

    // ! display
    public void display()
    {
        int i = front;
        do {
            System.out.println(data[i]);
            i++;
            i %= data.length;
        }while (i != end);
    }


}
