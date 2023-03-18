package com.company.StackQueue;

import java.util.*;

public class InbuiltExamples {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//        System.out.println(stack.pop());

        // * queue is interface internally it is implimented in java as linked list.
        // * here the abstract methods in the queue are implemented in the linked list class internally in java.
        // * here the concept in oop is implemented where the methods in the inteface queue is need to be implemented in the object linkedlist it indicates the object implementation is in the linked list object and the defination is in the queue interface.

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(4);
        queue.add(1);

        System.out.println(queue.peek());

        // * Arraydeques implements the methods available in the deque as it's an interface.
        Deque<Integer> deque = new ArrayDeque<>();

    }
}
