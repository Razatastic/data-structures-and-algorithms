package Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class EdgeTest {

    @Test
    void hashCodeCheck() {
        Edge test = new Edge(new Node("Start"), new Node("End"), 2);
        Edge test2 = new Edge(new Node("Start"), new Node("End"), 1);
        assertEquals(test, test2);
    }
}
