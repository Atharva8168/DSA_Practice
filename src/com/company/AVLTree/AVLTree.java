package com.company.AVLTree;

public class AVLTree {

    private class AVLNode{
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;
        private int height;

        public AVLNode(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Value = " + this.value;
        }
    }

    private AVLNode root;

    public void insert(int value){
        root = insert(root , value);

    }

    private AVLNode insert(AVLNode root , int value){
        if (root == null)
            return new AVLNode(value);

        if (root.value < value)
            root.rightChild = insert(root.rightChild, value);

        else
            root.leftChild = insert(root.leftChild, value);

        setHeight(root);

        return balance(root);
    }

    private AVLNode balance(AVLNode root){
        if (isRightHeavy()) {
            if (balanceFactor() > 0)
                root.rightChild = rotateRight(root.rightChild);
            return rotateLeft(root);
        }
        else if (isLeftHeavy()) {
            if (balanceFactor() < 0)
                root.leftChild = rotateLeft(root.leftChild);
            return rotateRight(root);
        }
        return root;
    }

    private AVLNode rotateLeft(AVLNode root){
        var newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateRight(AVLNode root){
        var newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(AVLNode node){
        node.height = Math.max(height(node.leftChild),
                height(node.rightChild)) + 1;
    }

    private boolean isLeftHeavy(){
        return balanceFactor() > 1;
    }

    private boolean isRightHeavy(){
        return balanceFactor() < -1;
    }

    private int balanceFactor(){
        return height(root.leftChild)-height(root.rightChild);
    }
    private int height(AVLNode node){
        return (node == null) ? -1 : node.height;
    }

}
