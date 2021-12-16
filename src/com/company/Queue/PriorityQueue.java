package com.company.Queue;

import java.util.Arrays;

public class PriorityQueue {
    private int count;
    private int i;

    private int[] array = new int[5];

    public void add(int input) {
        if (isFull())
            throw new IllegalStateException();

        var num = shiftNumbersToAdd(input);

        array[num] = input;
        count++;
    }


    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return array[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == array.length;
    }

    private int shiftNumbersToAdd(int item) {
        for (i = count - 1; i >= 0; i--) {
            if (array[i] > item) {
                array[i + 1] = array[i];
            } else
                break;
        }
        return i + 1;
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
