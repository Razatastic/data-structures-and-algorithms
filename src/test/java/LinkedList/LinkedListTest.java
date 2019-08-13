package LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListTest {
    private static LinkedList test = new LinkedList("hello"); // with initial value for head node
    private static LinkedList test2 = new LinkedList(); // without initial value for head node

    @Test
    @DisplayName("Checks whether the head is properly being initialized in the constructor")
    void headIsInitialized() {
        assertEquals("hello", test.peek());
    }

    @Test
    void getHead() throws OutOfRangeException {
        assertEquals("hello", test.get(0));
    }

    @Test
    void getAnyElement() throws OutOfRangeException {
        test.add("yo");
        assertEquals("yo", test.get(1));
    }

    @Test
    @DisplayName("Checks if the input is being added to the end of the list")
    void add() throws OutOfRangeException {
        test.add("world");
        assertEquals("world", test.getLast());
    }

    @Test
    void addAtFront() {
        test.addFirst("Yo");
        assertEquals("Yo", test.peek());
    }

    @Test
    void addAtIndex() throws OutOfRangeException {
        test.add("world");
        test.add(1, "testing");
        assertEquals("testing", test.get(1));
    }

    @Test
    @DisplayName("Check if the list constructor without arguments is initializing properly")
    void headIsNull() {
        assertNull(test2.peek());
    }
}