package com.company.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        System.out.println(queue);
//        reverse(queue);
//        System.out.println(queue);

//        ArrayQueue aq = new ArrayQueue(5);
//        aq.enqueue(10);
//        aq.enqueue(10);
//        aq.enqueue(10);
//        aq.enqueue(10);
//        aq.dequeue();
//        System.out.println(aq.toString());
//        aq.enqueue(20);
//        aq.enqueue(20);
//        aq.enqueue(20);
//        System.out.println(aq.toString());


//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.dequeue();
//        System.out.println(queue.dequeue());


        PriorityQueue queue = new PriorityQueue();
        queue.add(8);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        var removed = queue.remove();
        System.out.println(removed);
        System.out.println(queue.toString());

    }









    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
