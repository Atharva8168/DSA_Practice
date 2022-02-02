package com.company.UnDirectedGraph;

public class main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","B",3);
        graph.addEdge("B","D",4);
        graph.addEdge("C","D",5);
        graph.addEdge("A","C",1);
        graph.addEdge("B","C",2);

        //Printing Graph
//        graph.print();

        //Shortest Path
//        var shortestPath = graph.getShortestPath("A", "C");
//        System.out.println(shortestPath);

        //Has Cycles
//        System.out.println(graph.hasCycle());

        //Minimum Spanning tree
        var tree = graph.getMinimumSpanningTree();
        tree.print();
    }

}
