package Graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Algorithms.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class EdgeTest {
    BubbleSort test = new BubbleSort();

    @Test
    void sortArr() {
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), Arrays.toString(BubbleSort.sort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1})));
    }
}
