package Algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {
    @Test
    void sortCheck() {
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5}), Arrays.toString(BubbleSort.sort(new int[]{4, 3, 1, 5, 2})));
    }
}
