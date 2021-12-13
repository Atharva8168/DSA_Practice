package com.company.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item){
        Node node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        Node node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;

        while (current != null){
            if (current.value == item) {
                return index;
            }
            else{
                current = current.next;
                index++;
            }
        }
        return -1;

    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NullPointerException();
            size = 0;

        if (first == last){
            first = last = null;
            size = 0;
        }

        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
            size = 0;
        if (first == last){
            first = last = null;
            size = 0;
        }
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
        size--;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int index = 0;
        var current = first;
        int[] array = new int[size];
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        if (isEmpty()){
            return;
        }
        var current = first.next;
        var previous = first;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;




    }

    public int getKthFromTheEnd(int k){
        if (isEmpty()){
            throw new IllegalStateException();
        }

        if(k>size){
            throw new IllegalArgumentException();
        }
        var current = first;
        var pointer = first;
        for (int i = 0; i<k-1 ; i++){
            pointer = pointer.next;
        }
        while(pointer != last){
            current = current.next;
            pointer = pointer.next;
        }
        return current.value;
    }



    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if (current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty(){
        return first == null;
    }



}
