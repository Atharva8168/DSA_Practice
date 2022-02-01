package com.company.UnDirectedGraph;

public class main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A","B",3);
        graph.addEdge("B","C",2);
        graph.addEdge("A","C",10);
//        graph.print();
        var shortestPath = graph.getShortestPath("A", "C");
        System.out.println(shortestPath);
    }
}
