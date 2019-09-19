package Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GraphTest {
    Graph test = new Graph();

    @Test
    void nodeCount() throws Exception {
        // Check count upon creation
        assertEquals(0, test.getNodeCount());

        // Check count after adding a node
        test.addNode("A");
        assertEquals(1, test.getNodeCount());

        // Check count after deleting a node
        test.removeNode("A");
        assertEquals(0, test.getNodeCount());
    }

    @Test
    void edgeCount() throws Exception {
        // Check count upon creation
        assertEquals(0, test.getEdgeCount());

        // Check count after adding an edge
        test.addEdge("A", "B", 12);
        assertEquals(1, test.getEdgeCount());

        // Check count after removing an edge
        test.removeEdge("A", "B");
        assertEquals(0, test.getEdgeCount());
    }
}
