package com.company.Stack;

import java.util.Arrays;

public class Stack {
    private int[] array = new int[5];
    private int top = 0;

    public void push(int input){
        if (top == array.length)
            throw new StackOverflowError();
        array[top++] = input;
    }

    public int pop(){
        if (isEmpty())
            throw new IllegalStateException();
        var poppedNumber = array[--top];
        array[top]=0;
        return poppedNumber;
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();
        var content = array[top-1];
        return content;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(array, 0, top);
        return Arrays.toString(content);
    }


}



