package com.company.Heap;

public class PriorityQueue {
    private Heap heap = new Heap();

    public void enqueue(int item){
        heap.insert(item);
    }

    public int dequeue(int item){
        return heap.remove();
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }
}
