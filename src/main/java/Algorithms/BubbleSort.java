package Algorithms;

class BubbleSort {
    /**
     * Optimization:
     * When inner loop doesn't perform a swap, it means the array is sorted.
     * To track this, we use a boolean.
     *
     * @param input array being sorted
     * @return sorted array
     */
    static <T extends Comparable<T>> T[] optimizedSort(T[] input) {
        boolean swapped;
        for (int i = 0; i < input.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j].compareTo(input[j + 1]) > 0) {
                    T temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return input;
    }

    static <T extends Comparable<T>> T[] sort(T[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j].compareTo((input[j + 1])) > 0) {
                    // Swap elements
                    T temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }
}
