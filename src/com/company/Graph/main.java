package com.company.Graph;

public class main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("D","C");
        graph.addEdge("A","C");
//        graph.removeNode("B");
//        graph.removeEdge("A","C");
//        graph.print();
//        graph.traverseDepthFirstRec("A");
        graph.traverseDepthFirst("B");
    }
}
