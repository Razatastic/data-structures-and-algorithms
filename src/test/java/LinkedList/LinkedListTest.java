package LinkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListTest {
    private static LinkedList<String> test = new LinkedList<>("one"); // with initial value for head node
    private static LinkedList<Integer> test2 = new LinkedList<Integer>(); // without initial value for head node

    void populateList() {
        test.add("three");
        test.add("five");
        test.add("seven");
    }

    @Test
    @DisplayName("Checks whether the head is properly being initialized in the constructor")
    void headIsInitialized() throws OutOfRangeException {
        assertEquals("one", test.peek());
    }

    @Test
    void getHead() throws OutOfRangeException {
        assertEquals("one", test.get(0));
    }

    @Test
    void getAnyElement() throws OutOfRangeException {
        populateList();
        assertEquals("five", test.get(test.size() - 2));
    }

//    @Test
//    @DisplayName("Checks if the input is being added to the end of the list")
//    void add() throws OutOfRangeException {
//        test.add("nine");
//        assertEquals("nine", test.getLast());
//    }
//
//    @Test
//    void addAtFront() {
//        test.addFirst("zero");
//        assertEquals("zero", test.peek());
//    }
//
//    @Test
//    void addAtIndex() throws OutOfRangeException {
//        test.add(1, "two");
//        assertEquals("two", test.get(1));
//    }

    @Test
    @DisplayName("Check if the list constructor without arguments is initializing properly")
    void headIsNull() {
        assertNull(test2.peek());
    }
}