package Algorithms;

public class BinarySearch {
    private static int getIndex(int[] input, int lo, int hi, int key) {
        if (hi >= lo) {
            // Calculate middle
            int mid = (lo + hi) / 2;
            // Check if key is equal to middle
            if (key == input[mid]) return mid;
                // If the key is greater, then run the search on the right-hand side of the array
            else if (key > input[mid]) return getIndex(input, mid + 1, hi, key);
                // If the key is smaller, then run the search on the left-hand side of the array
            else return getIndex(input, lo, mid - 1, key);
        }
        // If key is not present
        return -1;
    }

    // Overloaded
    private static int getIndex(int[] input, int key) throws NullPointerException {
        if (input == null) throw new NullPointerException();
        return getIndex(input, 0, input.length - 1, key);
    }
}
