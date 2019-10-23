package Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class EdgeTest {

    @Test
    void hashCodeCheck() {
        Edge<Integer> test = new Edge<Integer>(new Node<>("Start"), new Node<>("End"), 2);
        Edge<Integer> test2 = new Edge<Integer>(new Node<>("Start"), new Node<>("End"), 1);
        assertEquals(test, test2);
    }
}
