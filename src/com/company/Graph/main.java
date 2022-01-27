package com.company.Graph;

public class main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("A","D");
        graph.removeNode("B");
        graph.print();
    }
}
