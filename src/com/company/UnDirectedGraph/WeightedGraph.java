package com.company.UnDirectedGraph;

import java.util.*;

public class WeightedGraph {

    private class Node{
        private String label;

        public Node(String label){
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
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
    private Map<Node, List<Edge>> adjacencyList = new HashMap<>();

    public void addNode(String label){
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to, int weight){
        var fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalStateException();

        var toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalStateException();

        adjacencyList.get(fromNode).add(
                new Edge(fromNode, toNode, weight));

        adjacencyList.get(toNode).add(
                new Edge(toNode, fromNode, weight));
    }

    public void print(){
        for (var source : adjacencyList.keySet()){
            var target = adjacencyList.get(source);
            if (!target.isEmpty())
                System.out.println(source + " is connected to " + target);
        }
    }

}
