package Algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SelectionSortTest
{
  @Test
  void sortCheck()
  {
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SelectionSort.sort(new int[]{4, 3, 1, 5, 2}));
  }
}
