package com.company.Tree;

public class main {
    public static void main(String[] args) {
        Tree tree =new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

//        Tree tree1 =new Tree();
//        tree1.insert(7);
//        tree1.insert(4);
//        tree1.insert(9);
//        tree1.insert(1);
//        tree1.insert(6);
//        tree1.insert(8);
//        tree1.insert(10);
//        tree.traversePreOrder();
//        tree.traverseInOrder();
//        tree.traversePostOrder();
//        System.out.println(tree.height());
//        System.out.println(tree.min());
//        System.out.println(tree.equals(tree1));
//        tree.swapRoots();
//        System.out.println(tree.isBinarySearchTree());
//        var list = tree.getNodeAtDistance(1);
//        System.out.println(list);
        tree.traverseLevelOrder();

    }

}
