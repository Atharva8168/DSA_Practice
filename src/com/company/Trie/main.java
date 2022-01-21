package com.company.Trie;

public class main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("can");
        System.out.println(trie.contains("ca"));

    }
}
