import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayListTest {
    private ArrayList<Integer> testListOne = new ArrayList<>();
    private ArrayList<String> testListTwo = new ArrayList<>();

    @Test
    void addIntegerElement() {
        testListOne.add(1);
        testListOne.add(234);
        testListOne.add(-7654);
        assertEquals("[1, 234, -7654, null]", testListOne.toString());
    }

    @Test
    void addStringElement() {
        testListTwo.add("Hello");
        testListTwo.add("World");
        assertEquals("[Hello, World]", testListTwo.toString());
    }
}
