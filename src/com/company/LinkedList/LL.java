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
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        // if no element in ll tail and head will be the same
        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    // TODO: GETTER AND SETTER FOR PRIVATE MEMBERS
    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    // TODO: DISPLAY
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // todo: insert at last   . can be done 0(1) as tail extra variable is taken for this process
    public void insertAtLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    // TODO: insert at anywhere
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
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
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

    }

    // TODO: DELETE LAST
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = getIndex(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public Node getIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // TODO: DELETE AT any INDEX
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = getIndex(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    // TODO: FIND THE VALUE
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    // * insertion using recursion
//    public void insertRec(int val, int index, Node node)
//    {
//        if (index == 0)
//        {
//            Node newNode =  new Node(val,node.next);
//            node.next = newNode;
//            return;
//        }
//
//        insertRec(val,index-1,node.next);
//    }

    public void insertRec(int val, int index) {

        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        // if head is null or position is out of bound it will ad

        if (node == null) {
            return new Node(val, null);
        }

        if (index == 0) {
            Node newNode = new Node(val, node);
            size++;
            return newNode;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    //? Node creation class
    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        // getter and setter
        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }

    // !Q. SORT USING BUBBLESORT
    public void bubbleSort(int row, int col)
    {
        if (row==0)
        {
            return;
        }

        if (col<row)
        {
            Node first = getIndex(col);
            Node second = getIndex(col+1);

            if (first.value > second.value)
            {
                //? For swap three cases are there
                // * head case, tail case, mid case
                if (first == head)
                {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail)
                {
                    Node prev = getIndex(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else {
                    Node prev = getIndex(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                  }

            }

            bubbleSort(row,col+1);
        }else
        {
            bubbleSort(row-1,0);
        }

    }

    // !Q REVERSING THE LINKED LIST USING RECURSION
    public void revLL(Node node)
    {
        if (node == tail)
        {
            head =tail;
            return;
        }

        revLL(head.next);
        tail.next = node ;
        tail = node;
        tail.next = null;

    }

    // !Q IN PLACE REVERSEL OF LL without recursion
    // https://leetcode.com/problems/reverse-linked-list/submissions/888669879/
     public void revLLiterator()
     {
         if (size < 2)
         {
             return;
         }
         Node prev = null;
         Node present = head;
         Node next = present.next;
         while (present!=null)
         {
             present.next = prev;
             prev = present;
             present = next;
             if (next != null)
             {
                 next = next.next;
             }

         }
         head = prev;
     }

     // ! Q reverse the sublist of the ll
    // https://leetcode.com/problems/reverse-linked-list-ii/

    public Node reverseBetween(Node head, int left, int right) {

        // if single element to reverse
        if (left == right)
        {
            return head;
        }

        // skipping the first left- 1 nodes
        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left-1; i++) {
            prev = current;
            current = current.next;
        }

        // two pointers for saving the value of ele before the sublist start ele and the sub list start element
        // * THEY ARE TWO DIFFERENT OBJECTS CHANGES TO ONE WILL NOT AFFECT THE OTHER OBJECT THAT IS USED TO STORE THE OBJECT.
        Node last = prev;
        Node newEnd = current;

        // reverse between the left and right
        Node next = current.next;
        for (int i = 0; current != null &&i < right - left + 1; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null)
                {
                    next = next.next;
                }

        }


        if (last!= null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;


    }

    public void nodetest() {
        // object pointing test explanation
        // hear the orginal list pointer changes the reference pointer to different object in heap.
        Node list = new Node(14);
        Node list1 = new Node(15);
        Node newlist = list;
        list = list1;
        System.out.println(newlist.value);
    }


}


