package com.company.Trie;

public class main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("care");
//        System.out.println(trie.contains("ca"));
//        trie.traverse();
        trie.remove("care");
        System.out.println(trie.contains("car"));
        System.out.println(trie.contains("care"));
    }
}
