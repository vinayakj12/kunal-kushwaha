package com.company.LinkedList;

public class DLL {

    private Node head;
    private int size;


    class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    //TODO: INSERT AT FIRST FUNCTION
    public void insertFirst(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null)
        {
            head.prev = newNode; // check for null pointer if head is already null
        }
        head = newNode;
        size += 1;
    }

    // TODO: INSERT AT LAST
    public void insertLast(int val)
    {
        Node newNode = new Node(val);
        Node temp = head;
        newNode.next = null;
        if (head == null)
        {
            newNode.prev = null;
            head = newNode;
            return;
        }

        while (temp.next!= null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        size += 1;
    }

    // TODO: INSERT AT ANYWHERE
    public void insert(int val, int index)
    {
        if (index == 0)
        {
            insertFirst(val);
            return;
        }
        if (index == size)
        {
            insertLast(val);
            return;
        }


        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val,temp.next,temp);
        if (temp.next != null) // check for null pointer exception if its the last element
        {temp.next.prev = newNode;}
        temp.next = newNode;
       // ! temp.next.prev = newNode;  this is the error that is not displaying the element in printing from reverse as temp.next is assigned to newNode in previous step it's not possible to connect the newNode after the index to inserted newNode fixing this by using newNode.next.prev = newNode or shifting it up.
        size ++;

    }

    // TODO: INSERT AFTER THE NODE volue
    public void insertAfter( int after, int val)
    {
        Node p = find(after);

        if (p == null)
        {
            System.out.println("Does not exist");
            return;
        }
        Node newNode = new Node(val,p.next,p);
        p.next = newNode;
        if (newNode.next != null)
        {newNode.next.prev = newNode;}
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

    // TODO: DISPLAY
    public void display()
    {
        Node temp = head;
        Node last = null;
        System.out.print("Print in start: ");
        while (temp != null)
        {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        // * Print in reverse
        System.out.print("Print in Reverse: ");
        while (last != null)
        {
            System.out.print(last.value + " -> ");
            last = last.prev;

        }
        System.out.println("START");
    }


}
