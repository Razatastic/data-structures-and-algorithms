package Algorithms;

class BubbleSort {
    static int[] sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    // Swap elements
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }

    /**
     * Optimization:
     * When inner loop doesn't perform a swap, it means the array is sorted.
     * To track this, we use a boolean.
     *
     * @param input array being sorted
     * @return sorted array
     */
    static int[] optimizedSort(int[] input) {
        boolean swapped;
        for (int i = 0; i < input.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    // Swap elements
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return input;
    }
}
