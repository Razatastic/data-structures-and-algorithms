package LinkedList;

import Exceptions.OutOfRangeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListTest {
    private static LinkedList<String> listOne = new LinkedList<>("one"); // with initial value for head node
    private static LinkedList<Integer> listTwo = new LinkedList<Integer>(); // without initial value for head node
    
    public static void main(String[] args) {
        listOne.add("two");
        listOne.add("three");
        listOne.add("four");
        listOne.add("five");
    }

    @Test
    @DisplayName("Checks whether the head is properly being initialized in the constructor")
    void headIsInitialized() {
        assertEquals("one", listOne.peek());
    }

    @Test
    @DisplayName("Checks the head's value")
    void getHead() throws OutOfRangeException {
        assertEquals("one", listOne.get(0));
    }

    @Test
    void getLastElement() throws OutOfRangeException {
        assertEquals("five", listOne.get(2));
    }

    @Test
    @DisplayName("Checks if the input is being added to the end of the list")
    void add() throws OutOfRangeException {
        listOne.add("seventy");
        assertEquals("seventy", listOne.getLast());
    }

    @Test
    @DisplayName("Check if the list constructor without arguments is initializing properly")
    void headIsNull() {
        assertNull(listTwo.peek());
    }
}