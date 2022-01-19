package com.company.Heap;

public class MaxHeap {

    public static void heapify(int[] array){
        for (int i = 0; i < array.length; i++){
            heapify(array, i);
        }

    }

    private static void heapify(int[] array, int index){
        var largerIndex = index;

        var leftIndex = index * 2 + 1;
        if (leftIndex < array.length && array[largerIndex] < array[leftIndex]){
            largerIndex = leftIndex;
        }

        var rightIndex = index * 2 + 2;
        if (rightIndex < array.length && array[largerIndex] < array[rightIndex]){
            largerIndex = rightIndex;
        }

        if (largerIndex == index)
            return;

        swap(array, largerIndex, index);
        heapify(array, largerIndex);

    }

    private static void swap(int[] array, int first, int second){
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
