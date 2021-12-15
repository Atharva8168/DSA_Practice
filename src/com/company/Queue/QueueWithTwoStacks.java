package com.company.Queue;

import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int input){
        stack1.push(input);
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        copyStack1ToStack2();

        return stack2.pop();
    }

    public int peek(){

        copyStack1ToStack2();

        return stack2.peek();
    }

    public boolean isEmpty(){
        return (stack1.isEmpty() && stack2.isEmpty());
    }

    public void copyStack1ToStack2(){
        if (stack2.isEmpty())
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

}
