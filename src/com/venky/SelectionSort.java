package com.venky;

import static com.venky.SortingUtils.minElementIndex;

/**
 * I call this algorithm as Select Minimum Sort
 */
public class SelectionSort {

    public static int[] sort(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            int minIndex = minElementIndex(a, i);
            SortingUtils.swap(a, i, minIndex);
        }
        return a;
    }

}
