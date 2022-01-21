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

}
