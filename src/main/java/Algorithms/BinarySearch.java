package Algorithms;

public class BinarySearch
{
  private static int getIndex(int[] input, int lo, int hi, int key)
  {
    if (hi >= lo)
    {
      int mid = (lo + hi) / 2;

      if (key == input[mid])
      {
        return mid;
      }

      // If the key is greater, then run the search on the right-hand side of the array
      else if (key > input[mid])
      {
        return getIndex(input, mid + 1, hi, key);
      }
      // If the key is smaller, then run the search on the left-hand side of the array
      else
      {
        return getIndex(input, lo, mid - 1, key);
      }
    }

    return -1; // Key not present
  }

  private static int getIndex(int[] input, int key) throws NullPointerException
  {
    if (input == null)
    {
      throw new NullPointerException();
    }

    return getIndex(input, 0, input.length - 1, key);
  }
}
