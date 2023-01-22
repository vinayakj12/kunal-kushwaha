package com.company.LinkedList;

public class LL {

    //* linked list attributes  .PART OF STRUCTURE OF LINKED LIST
    private Node head;
    private Node tail;

    public int size;

    public LL() {
        this.size = 0;
    }
    // *

    // ! linked list functions

    //TODO: INSERT AT FIRST FUNCTION
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        // if no element in ll tail and head will be the same
        if (tail == null)
        {
            tail = head;
        }

        size += 1;
    }

    // TODO: DISPLAY
    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // todo: insert at last   . can be done 0(1) as tail extra variable is taken for this process
    public void insertAtLast(int val)
    {
        if (tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    // TODO: insert at anywhere
    public void insert(int val, int index)
    {
        if (index == 0)
        {
            insertFirst(val);
            return;
        }
        if (index == size)
        {
            insertAtLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        // current.next = temp.next
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    // TODO: DELETE FIRST
    public int deleteFirst()
    {
        int val = head.value;
        head = head.next;
        if (head == null)
        {
            tail = null;
        }
        size--;
        return val;

    }

    // TODO: DELETE LAST
    public int deleteLast()
    {
        if (size<= 1)
        {
            return deleteFirst();
        }

        Node secondLast = getIndex(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public Node getIndex(int index)
    {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // TODO: DELETE AT any INDEX
    public int delete(int index)
    {
        if (index == 0)
        {
            return deleteFirst();
        }

        if (index == size -1)
        {
            return deleteLast();
        }

        Node prev = getIndex(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    // TODO: FIND THE VALUE
    public Node find(int value)
    {
        Node node = head;
        while (node != null)
        {
            if (node.value == value)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }



    //? Node creation class
    private class Node {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}

