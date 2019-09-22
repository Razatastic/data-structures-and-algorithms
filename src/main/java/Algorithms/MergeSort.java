package Algorithms;

import java.util.Arrays;

public class MergeSort {

    private static void sort(int[] arr, int lo, int hi) {
        int mid = (lo + hi) / 2;
    }

    // Utility method
    private static void sort(int[] arr) {
        sort(arr, 0, arr.length);
    }


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before: " + Arrays.toString(arr));

        // Sort
        sort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
