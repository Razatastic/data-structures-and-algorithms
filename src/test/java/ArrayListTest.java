import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayListTest {
    private ArrayList<Integer> testListOne = new ArrayList<>();
    private ArrayList<String> testListTwo = new ArrayList<>();

    void populateIntegerList() {
        testListOne.add(1);
        testListOne.add(234);
        testListOne.add(-7654);
        testListOne.add(0);
    }

    @Test
    void addIntegerElement() throws Exception {
        populateIntegerList();
        assertEquals("[1, 234, -7654, 0]", testListOne.toString());

        // Check again with more than 4 values
        populateIntegerList();
        testListOne.remove(Integer.valueOf(0));
        assertEquals("[1, 234, -7654, 0]", testListOne.toString());
    }

    @Test
    void addStringElement() {
        testListTwo.add("Hello");
        testListTwo.add("World");
        assertEquals("[Hello, World]", testListTwo.toString());
    }

    @Test
    void removeElement() {

    }
}
