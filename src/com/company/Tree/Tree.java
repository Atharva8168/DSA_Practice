package com.company.Tree;

import java.util.ArrayList;

public class Tree {
    public class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return ("Node = " + value);
        }
    }

    private Node root;

    public void insert(int value){
        var node = new Node(value);

        if (root == null){
            root = node;
            return;
        }

        var current = root;
        while(true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value){
        var current = root;
        while(current != null){
            if (current.value > value)
                current = current.leftChild;
            else if (current.value < value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }
    public void traversePreOrder(Node root){
        if (root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root){
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);

    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }
    private void traversePostOrder(Node root){
        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(root);
    }
    private int height(Node root){
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));

    }

    //O(log n)
    public int min(){
        if (root == null)
            throw new IllegalStateException();

        var current = root;
        var last = current;
        while (current != null){
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }
    //O(n)
    private int min(Node root){
        if (isLeaf(root))
            return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return  Math.min(Math.min(left, right) , root.value);
    }

    private boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;
    }

    public boolean equals (Tree other){
        if (other == null)
            return false;

        return equals(root , other.root);


    }
    private boolean equals (Node first , Node second){
        if (first == null && second == null)
            return true;

        if (first != null && second != null)
            return first.value == second.value &&
                    equals(first.rightChild, second.rightChild) &&
                    equals(first.leftChild, second.leftChild);

        return false;
    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root , Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean isBinarySearchTree(Node root , int min , int max){
        if (root == null)
            return true;


        if (root.value > max || root.value < min)
            return false;

        return isBinarySearchTree(root.rightChild , root.value + 1 , max) &&
                isBinarySearchTree(root.leftChild , min , root.value - 1);

    }

    public void swapRoots(){
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    public ArrayList printNodeAtDistance(int distance) {
        ArrayList<Integer> list = new ArrayList<>();
        printNodeAtDistance(root, distance, list);
        return list;
    }


    private void printNodeAtDistance(Node root , int distance, ArrayList<Integer> list){
        if (root == null)
            return;

        if (distance == 0)
            list.add(root.value);

        printNodeAtDistance(root.leftChild , distance -1 , list);
        printNodeAtDistance(root.rightChild , distance -1 , list);
    }

}
