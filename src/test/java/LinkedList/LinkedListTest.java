package LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTest {
    private static LinkedList test = new LinkedList("hello");

    @Test
    void addCheck() {
        assertEquals(test.peek(), test.add("hello"));
    }

    @Test
    void addCheck2() {
        assertEquals("s", test.add("s"));
    }

    @Test
    void getElem() throws OutOfRangeException {
        assertEquals("hello", test.getElement(0));
    }

    @Test
    void getElem2() throws OutOfRangeException {
        assertEquals("do", test.getElement(3));
    }
}
