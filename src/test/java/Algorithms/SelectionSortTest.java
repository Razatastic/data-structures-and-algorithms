package Algorithms;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSortTest {
    @Test
    void sortCheck() {
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5}), Arrays.toString(SelectionSort.sort(new int[]{4, 3, 1, 5, 2})));
    }
}
