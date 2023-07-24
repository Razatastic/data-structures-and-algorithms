package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest
{
  String[] words = {"hello", "my", "name", "is", "ahmad"};

  @Test
  void stringSortCheck()
  {
    assertArrayEquals(new String[]{"ahmad", "hello", "is", "my", "name"}, BubbleSort.sort(words));
  }

  @Test
  void numberSortCheck()
  {
    assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, BubbleSort.sort(new Integer[]{4, 3, 1, 5, 2}));
  }

  @Test
  void optimizedStringSortCheck()
  {
    assertArrayEquals(new String[]{"ahmad", "hello", "is", "my", "name"}, BubbleSort.optimizedSort(words));
  }

  @Test
  void optimizedNumberSortCheck()
  {
    assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, BubbleSort.sort(new Integer[]{4, 3, 1, 5, 2}));
  }
}
