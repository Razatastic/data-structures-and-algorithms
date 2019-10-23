package Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class EdgeTest {

    @Test
    void hashCodeCheck() {
        Edge<String, Integer> test = new Edge<String, Integer>(new Node<>("Start"), new Node<>("End"), 2);
        Edge<String, Integer> test2 = new Edge<String, Integer>(new Node<>("Start"), new Node<>("End"), 1);
        assertEquals(test, test2);
    }
}
