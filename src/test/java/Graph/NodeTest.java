package Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void dataRetrievalMethods() {
        Node test = new Node("yo");
        assertEquals(test.getData(), test.toString());
    }

    @Test
    void hashCodeCheck() {
        Node test = new Node("yo");
        Node test1 = new Node("yo");
        Node test2 = new Node("Yo");
        assertEquals(test, test1);
        assertNotEquals(test, test2);
    }
}