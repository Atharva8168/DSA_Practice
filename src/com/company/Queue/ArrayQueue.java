package com.company.Queue;

import java.util.Arrays;

public class ArrayQueue {
    private int front = 0;
    private int rear = 0;
    private int count = 0;
    private int[] array;
    private int size;

    public ArrayQueue(int capacity){
         size = capacity;
        array = new int[capacity];
    }

    public void enqueue(int input){
        if (count == array.length)
            throw new IllegalStateException();

        array[rear] = input;
        rear = (rear + 1) % array.length;
        count++;
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        var item = array[front];
        array[front] = 0;
        front = (front + 1) % array.length;
        count--;
        return item;
    }

    public int peek(){
        return array[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == size;
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }





}
