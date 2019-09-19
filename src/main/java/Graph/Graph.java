package Graph;

import java.util.*;

class Graph {
    private int nodeCount; // Order
    private int edgeCount; // Size
    private Map<Node, Set<Edge>> adjList;

    /**
     * Constructor
     */
    Graph() {
        nodeCount = 0;
        edgeCount = 0;
        adjList = new HashMap<>();
    }

    /**
     * Constructor (Overloaded)
     *
     * @param val value of first node
     */
    Graph(String val) throws Exception {
        this();
        addNode(val); // Adds the first node to the map
    }

    /**
     * Check if node exists in adjacency list
     *
     * @param node node you're checking for
     * @return <tt>true</tt> if node is present in adjacency list
     */
    private boolean nodeExists(Node node) {
        return node != null && adjList.containsKey(node);
    }

    /**
     * Adds a node to the adjacency list
     *
     * @param input the value of the node
     */
    void addNode(String input) throws Exception {
        // Create a node with the given input
        Node newNode = new Node(input);

        // Check if the node already exists
        if (nodeExists(newNode)) throw new Exception("The key already exists!");

        // If it does not, then add it to the adjacency list and increment the node count
        adjList.put(newNode, new HashSet<>());
        incrementNodeCount();
    }

    /**
     * Remove the specified node's references from all the values containing it and it's key reference.
     *
     * @param input node being removed
     */
    void removeNode(String input) {
        // Create a node with the given input
        Node nodeBeingRemoved = new Node(input);

        // Remove all references in the set of values
        adjList.values().forEach(value -> value.forEach(edge -> {
            if (edge.getStart().equals(nodeBeingRemoved) || edge.getEnd().equals(nodeBeingRemoved)) {
                value.remove(edge);
            }
        }));

        // Remove the actual key and decrement the node count
        adjList.remove(nodeBeingRemoved);
        decrementNodeCount();
    }

    /**
     * Checks whether an edge exists between two nodes.
     *
     * @param start the starting node
     * @param end   the ending node
     * @return <tt>true</tt> if an edge exists between these nodes
     */
    private boolean edgeExists(Node start, Node end) throws Exception {
        // Check if nodes exist
        if (!nodeExists(start) || !nodeExists(end)) {
            throw new Exception("Nodes are invalid");
        }

        Edge one = new Edge(start, end, 0);
        Edge two = new Edge(end, start, 0);
        return adjList.get(start).contains(one) || adjList.get(end).contains(two);
    }

    /**
     * Adds an edge between two nodes.
     *
     * @param start  starting node
     * @param end    ending node
     * @param weight weight between nodes
     * @throws Exception when the start node is the same as the end node
     */
    void addEdge(String start, String end, int weight) throws Exception {
        // Check if the start is equal to the end
        if (start.equals(end)) throw new Exception("You can't create an edge between the same node!");

        // Create start & end nodes from the inputted strings
        Node startNode = new Node(start);
        Node endNode = new Node(end);

        // Check if the adjacency list contains both nodes
        if (!adjList.containsKey(startNode)) addNode(start);
        if (!adjList.containsKey(endNode)) addNode(end);

        // Check if the edge exists
        if (edgeExists(startNode, endNode)) {
            throw new Exception("The edge already exists!");
        }

        // Create the edge if it doesn't exist
        adjList.get(startNode).add(new Edge(startNode, endNode, weight));
        adjList.get(endNode).add(new Edge(endNode, startNode, weight));

        incrementEdgeCount();
    }

    /**
     * Removes the edge between two nodes.
     *
     * @param start starting node
     * @param end   ending node
     */
    void removeEdge(String start, String end) throws Exception {
        // Create start & end nodes from the inputted strings
        Node startNode = new Node(start);
        Node endNode = new Node(end);

        // Remove each nodes reference from the other nodes set
        if (edgeExists(startNode, endNode)) {
            adjList.get(startNode).remove(new Edge(startNode, endNode, 0));
            adjList.get(endNode).remove(new Edge(endNode, startNode, 0));
            decrementEdgeCount();
        }
    }

    /**
     * Prints all the values present in the adjacency list.
     */
    void printAdjList() {
        adjList.forEach((key, value) -> {
            System.out.print(key + ": ");
            value.forEach(edge -> System.out.print(edge.getStart() + " & " + edge.getEnd() + ", "));
            System.out.println();
        });
    }

    public int getNodeCount() {
        return nodeCount;
    }

    public int getEdgeCount() {
        return edgeCount;
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
