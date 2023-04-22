package com.company.StackQueue;

// Queue implementation with single pointer
public class CustomQueue {

    int[] data;
    int end = 0;
    private static final int DEFAULT_SIZE = 3;

    // ! constructor with isfull and emty
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

    // ! insertion
    public boolean insert (int item)
    {
        if (isFull())
        {
            return false;
        }

        data[end++] = item;
        return true;
    }

    // ! Removing
    public int removed() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Queue is Empty");
        }

        int removed = data[0];

        // shift the elements to left for removing the first element from queue

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    // ! peek
    public int front() throws Exception
    {
      if (isEmpty()) {

          throw new Exception("Queue is empty");
      } 

      return data[0];
    }

    // ! display
    public void display()
    {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }

        System.out.println("End");
    }


    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);

        queue.display();

        System.out.println(queue.removed());

        queue.display();


    }
    
}




