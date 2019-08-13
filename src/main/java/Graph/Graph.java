//package Graph;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//
//public class Graph<T, V extends Comparable<V>> {
//    int numOfNodes; // Order
//    int numOfEdges; // Size
//    Map<Vertex<T>, Set<Edge<V>>> adjList;
//
//    Graph() {
//        numOfEdges = 0;
//        adjList = new HashMap<>();
//    }
//
//    void addVertex(T data) {
//        Vertex<T> valBeingAdded = new Vertex<>(data);
//        if (!adjList.containsKey(valBeingAdded)) {
//            adjList.put(valBeingAdded, new HashSet<>());
////            incrementDegree();
//        }
//    }
//
//    void removeVertex(T data) throws KeyNotFoundException {
//        if (vertexExists(data)) {
//            Vertex v = getVertex(data);
////            if (hasNeighbors()) {
////
////            }
//        } else {
//            throw new KeyNotFoundException("The vertex being removed doesn't exist!");
//        }
//    }
//
//    boolean hasNeighbors(T data) {
//        return adjList.get(data).size() == 0 ? false : true;
//    }
//
//    void addEdge(T startVal, T endVal, V weight) {
//        if (!vertexExists(startVal)) {
//            addVertex(startVal);
//        }
//        if (!vertexExists(endVal)) {
//            addVertex(endVal);
//        }
//
//        Vertex<T> start = getVertex(startVal), end = getVertex(endVal);
//
//        // Create an edge between the two vertices
//        adjList.entrySet().forEach(entry -> {
////            if (entry.getKey().equals(start)) {
////                entry.getValue().add(new Edge<>(start, end, weight));
////            }
////            if (entry.getKey().equals(end)) {
////                entry.getValue().add(new Edge<>(end, start, weight));
////            }
//        });
//        incrementSize();
//    }
//
//    boolean vertexExists(T input) {
//        Vertex v1 = new Vertex<>(input);
//        return adjList.containsKey(v1);
//    }
//
//    Vertex<T> getVertex(T input) {
//        Vertex<T> temp = new Vertex<>(input);
//        if (!adjList.containsKey(temp)) {
//            return null;
//        }
//        return temp;
//    }
//
//    void incrementSize() {
//        numOfEdges++;
//    }
//
//    void decrementSize() {
//        numOfEdges--;
//    }
//
////    void incrementDegree() {
////        numOfVertices++;
////    }
////
////    void decrementDegree() {
////        numOfVertices--;
////    }
//}
