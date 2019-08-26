package Algorithms;

public class SelectionSort {
    static void sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[minIndex] > input[j]) minIndex = j;
            }
            // Swap
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }

    }
}