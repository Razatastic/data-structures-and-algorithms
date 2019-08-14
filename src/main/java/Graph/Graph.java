package Graph;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.*;

public class Graph {
    private int nodeCount; // Order
    private int edgeCount; // Size
    private Map<Node, Set<Edge>> adjList;

    Graph() {
        nodeCount = 0;
        edgeCount = 0;
        adjList = new HashMap<>();
    }

    /**
     * Adds a node to the adjacency list
     *
     * @param input the value of the node
     */
    void addNode(String input) {
        // Create a node with the given input
        Node newNode = new Node(input);

        // Check if the node already exists
        if (adjList.containsKey(newNode)) throw new KeyAlreadyExistsException();

        // If it does not, then add it to the adjacency list and increment the node count
        adjList.put(new Node(input), new HashSet<>());
        incrementNodeCount();
    }

    void removeNode(String input) {
        // Create a node with the given input
        Node nodeBeingRemoved = new Node(input);

        // Remove all references in the sets
        adjList.values().forEach(value -> value.forEach(edge -> {
            if (edge.getStart().equals(nodeBeingRemoved) || edge.getEnd().equals(nodeBeingRemoved)) {
                value.remove(edge);
            }
        }));

        // Remove the actual key
        adjList.remove(nodeBeingRemoved);
    }

    void addEdge(String start, String end, int weight) throws Exception {
        if (start.equals(end)) throw new Exception("You can't create an edge between the same point!");

        Node startNode = new Node(start);
        Node endNode = new Node(end);

        if (!adjList.containsKey(startNode)) addNode(start);
        if (!adjList.containsKey(endNode)) addNode(end);

        if (edgeExists(startNode, endNode)) {
            throw new ValueAlreadyExistsException("Already exists!");
        }

        adjList.get(startNode).add(new Edge(startNode, endNode, weight));
        adjList.get(endNode).add(new Edge(endNode, startNode, weight));
    }

    void removeEdge(String start, String end) {
        Node startNode = new Node(start);
        Node endNode = new Node(end);

        if (edgeExists(startNode, endNode)) {
            adjList.get(startNode).remove(new Edge(startNode, endNode, 0));
            adjList.get(endNode).remove(new Edge(endNode, startNode, 0));
        }
    }

    private boolean edgeExists(Node start, Node end) {
        Edge one = new Edge(start, end, 0);
        Edge two = new Edge(start, end, 0);
        return adjList.get(start).contains(one) || adjList.get(end).contains(two);
    }

    void printAdjList() {
        adjList.forEach((key, value) -> {
            System.out.print(key + ": ");
            value.forEach(edge -> {
                System.out.print(edge.getStart() + " & " + edge.getEnd() + ", ");
            });
            System.out.println();
        });
    }

    private void incrementNodeCount() {
        nodeCount++;
    }

    private void decrementNodeCount() {
        nodeCount--;
    }

    private void incrementEdgeCount() {
        edgeCount++;
    }

    private void decrementEdgeCount() {
        edgeCount--;
    }
}
