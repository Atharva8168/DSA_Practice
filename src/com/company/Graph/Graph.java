package com.company.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private class Node{
        private String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label){
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to){
        var fromNode = new Node(from);
        if (fromNode == null)
            throw new IllegalStateException();

        var toNode = new Node(to);
        if (toNode == null)
            throw new IllegalStateException();

        adjacencyList.get(fromNode).add(toNode);
    }
    

}
