package Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GraphTest {
    private Graph<String, Integer> test = new Graph<String, Integer>();

    @Test
    void nodeCount() throws Exception {
        // Check count upon creation
        assertEquals(0, test.getNodeCount());

        // Check count after adding a node
        test.addNode("A");
        test.addNode("F");
        assertEquals(2, test.getNodeCount());

        // Check count after deleting a node
        test.removeNode("A");
        test.removeNode("c");
        assertEquals(1, test.getNodeCount());
    }

    @Test
    void edgeCount() throws Exception {
        // Check count upon creation
        assertEquals(0, test.getEdgeCount());

        // Check count after adding an edge
        test.addEdge("A", "B", 12);
        test.addEdge("B", "C", 5);
        test.addEdge("A", "C", 100);
        test.addEdge("B", "D", 21);
        test.addEdge("C", "D", 1);
        assertEquals(5, test.getEdgeCount());

        // Check count after removing an edge
        test.removeEdge("A", "B");
        test.removeEdge("C", "B");
        assertEquals(3, test.getEdgeCount());
    }
}
