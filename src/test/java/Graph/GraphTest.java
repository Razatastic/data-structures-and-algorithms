package Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GraphTest {
    static private Graph test = new Graph();

    public static void main(String[] args) throws Exception {
        test.addNode("A");
        test.addNode("B");
        test.addNode("C");
        test.addEdge("A", "B", 3);
        test.addEdge("D", "C", 12);

        test.printAdjList();

        test.removeEdge("B", "A");
        System.out.println("----------------");
        test.printAdjList();
    }
//    @Test
//    void addNode() {
//        assertTrue(test.addNode("D"));
//        test.addNode("D");
//    }
}
