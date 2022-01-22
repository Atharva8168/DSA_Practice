package com.company.Trie;

public class main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("egg");
        trie.insert("carefull");

//        System.out.println(trie.contains("ca"));
//        trie.traverse();
//        trie.remove("care");
//        System.out.println(trie.contains("car"));
//        System.out.println(trie.contains("care"));
        System.out.println(trie.findWords("carefull"));

    }
}
