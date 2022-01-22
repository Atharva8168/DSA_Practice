package com.company.Trie;

import java.util.HashMap;

public class Trie {
//    public static int ALPHABET_SIZE = 26;

    private class Node {
        private char value;
        // Using array
//        private Node[] children = new Node[ALPHABET_SIZE];
        // Using HashMap -> to saw memory
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }

        public boolean hasChild(char alphabet){
            return children.containsKey(alphabet);
        }

        public void addChild(char alphabet){
            children.put(alphabet, new Node(alphabet));
        }

        public Node getChild(char alphabet){
            return children.get(alphabet);
        }

        public Node[] getChildren(){
            return children.values().toArray(new Node[0]);
        }
    }

    private Node root = new Node(' ');

    public void insert(String word){
        var current = root;

        for (var alphabet : word.toCharArray()){
            // Using array
//            var index = alphabet - 'a';

//            if (current.children[index] == null)
//                current.children[index] = new Node(alphabet);
//            current  =  current.children[index];

            // Using HashMap
            if (!current.hasChild(alphabet))
                current.addChild(alphabet);
            current = current.getChild(alphabet);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String word){
        if (word == null)
            return false;

        var current = root;
        for (char alphabet : word.toCharArray()){
            if (!current.hasChild(alphabet))
                return false;
            current = current.getChild(alphabet);
        }
        return current.isEndOfWord;
    }

    public void traverse(){
        traverse(root);
    }

    private void traverse(Node root){
        // Pre-order traversal -> Used for Inserting or lookup
        System.out.println(root.value);

        for (var alphabet : root.getChildren()){
            traverse(alphabet);
        }

        //Post-order traversal -> used for deleting

//        for (var alphabet : root.getChildren()){
//            traverse(alphabet);
//        }
//
//        System.out.println(root.value);


    }

}
