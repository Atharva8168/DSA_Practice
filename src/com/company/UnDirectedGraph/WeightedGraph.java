package com.company.UnDirectedGraph;

import java.util.*;

public class WeightedGraph {

    private class Node{
        private String label;
        private List<Edge> edges = new ArrayList<>();

        public Node(String label){
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }

        private void addEdge(Node to, int weight){
            edges.add(new Edge(this, to, weight));
        }

        private List<Edge> getEdges(){
            return edges;
        }

    }

    private class Edge{
        private Node from;
        private Node to;
        private int weight;

        public Edge(Node from, Node to, int weight) {
            this.to = to;
            this.from = from;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return from + "->" + to;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();

    public void addNode(String label){
        nodes.putIfAbsent(label, new Node(label));
    }

    public void addEdge(String from, String to, int weight){
        var fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalStateException();

        var toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalStateException();

        fromNode.addEdge(toNode, weight);
        toNode.addEdge(fromNode, weight);
    }

    public void print(){
        for (var node : nodes.values()){
            var edges = node.edges;
            if (!edges.isEmpty())
                System.out.println(node + " is connected to " + edges);
        }
    }

}
